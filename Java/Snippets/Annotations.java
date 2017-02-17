/**
 * Common Java core platform annotations
 *  - Most affect compilation
 *      > Override
 *      > Deprecated
 *      > Suppress Warnings
 *
 */
class Doer {

    @Deprecated
    void doItThisWay(){...}

    void doItThisNewWay(){...}
}

class MyWorker{

    @SuppressWarnings("deprecation")
    void doSomeWork(){
        Doer d = new Doer();
        d.doItThisWay();;
    }

    @SuppressWarnings("deprecation")
    void doDoubleWork(){
        Doer d1 = new Doer();
        Doer d2 = new Doer();
        d1.doItThisWay();
        d2.doItThisWay();
    }
}

/**
 * Annotations are a special kind of interface
 *      - Usage is more restricted
 *          > Can't be explicitly implemented
 *      - Implicitly extend Annotation interface
 *      - Interface behavior not initially apparent
 *
 * * Note: Annotations can optionally have elements
 *
 */

// Declare Annotations
public @interface WorkHandler {
    boolean useThreadPool();
}

@WorkHandler(useThreadPool = false)
public class AccountWorker implements Runnable, TaskWorker {
    BankAccount ba;

    public void setTarget(Object target){...}

    public void doWork(){
        Thread t = new Thread(
                HighVolumeAccount.class.isInstance(ba) ? (HighVolumeAccount)ba : this);
        t.start();
    }

    public void run(){...}
}

// Access Annotations
void startWork(String workerTypeName, Object workerTarget) throws Exception {
    Class<?> workerType = Class.forName(workerTypeName);
    TaskWorker worker = (TaskWorker)workerType.newInstance();
    worker.setTarget(workerTarget);

    WorkHandler wh = workerType.getAnnotation(WorkHandler.class);
    if(wh == null)
        // throw exception - will throw exception in this situation
    if(wh.useThreadPool())
        pool.submit(new Runnable(){
            public void run(){
                worker.doWork();
            }
        });

    worker.doWork();
}

// Annotation Retention
@Retention(RetentionPolicy.RUNTIME)
public @interface WorkHandler {
    boolean useThreadPool();
}

void startWork(String workerTypeName, Object workerTarget) throws Exception {
    Class<?> workerType = Class.forName(workerTypeName);
    TaskWorker worker = (TaskWorker)workerType.newInstance();
    worker.setTarget(workerTarget);

    WorkHandler wh = workerType.getAnnotation(WorkHandler.class);
    if(wh == null)
        // throw exception
        if(wh.useThreadPool())
            // will work now with retention
            pool.submit(new Runnable(){
                public void run(){
                    worker.doWork();
                }
            });

    worker.doWork();
}

// Annotation Target
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface WorkHandler {
    boolean useThreadPool();
}

// Element Default Values
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface WorkHandler {
    boolean useThreadPool() default true;
}

@WorkHandler
public class AccountWorker implements Runnable, TaskWorker{...}

// Annotation Class<?> Element
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ProcessedBy {
    Class<?> value();
}

@ProcessedBy(AccountWorker.class)
public class BankAccount {

    public BankAccount(String id){...}
    public BankAccount(String id, int balance){...}
    ...
}

BankAccount acct1 = new BankAccount();
startWorkSelfContained(acct1);

void startWorkSelfContained(Object workerTarget) throws Exception {
    Class<?> targetType = workerTarget.getClass();
    ProcessedBy pb = targetType.getAnnotation(ProcessedBy.class);
    Class<?> workerType = pb.value();
    TaskWorker worker = (TaskWorker)workerType.newInstance();
    ...
}