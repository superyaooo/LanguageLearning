// Access Field Information
public class BankAccount {
    private final String id;
    private int balance = 0;
    ...
}

void fieldInfo(Object obj) {
    Class<?> theClass = obj.getClass();

    Field[] fields = theClass.getFields();
    displayFields(fields);  // only displays public fields; in this case, prints nothing

    Field[] declaredFields = theClass.getDeclaredFields();
    displayFields(declaredFields);  // prints all fields
}

void displayFields(Field[] arr){
    for(Field f:arr)
        System.out.println(f.getName() + " : " + f.getType());
}

// Access Method Information
public class BankAccount {
    public String getId() {...}
    public synchronized int getBalance() {...}
    public synchronized void deposit(int amount) {...}
    public synchronized void withdrawal(int amount) {...}
    ...
}

void methodInfo(Object obj){
    Class<?> theClass = obj.getClass();

    Method[] methods = theClass.getMethods();

    Method[] declMethods = theClass.getDeclaredMethods();
    for(Method m:declMethods)
        // do something
}

// Exclude Object Class Methods
void methodInfo2(Object obj) {
    Class<?> theClass = obj.getClass();

    Method[] methods = theClass.getMethods();
    for (Method m : methods) {
        if (m.getDeclaringClass() != Object.class)
            System.out.println(m.getName());
    }
}