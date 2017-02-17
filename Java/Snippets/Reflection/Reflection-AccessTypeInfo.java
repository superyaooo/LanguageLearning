public final class HighVolumeAccount extends BankAccount implements Runnable {
    public HighVolumeAccount(String id) {super(id);}
    public HighVolumeAccount(String id, int balance) {super(id, balance);}

    private int[] readDailyDeposits() {...}
    private int[] readDailyWithdrawals() {...}

    public String run(){
        for(int depositAmt:readDailyDeposits())
            deposit(depositAmt);

        for(int withdrawalAmt:readDailyWithdrawals())
            withdrawal(withdrawalAmt);
    }
}

// Accessing Superclass and Interfaces using Reflection
void classInfo(Object obj) {
    Class<?> theClass = obj.getClass();
    System.out.println(theClass.getSimpleName());

    Class<?> superclass = theClass.getSuperclass();

    Class<?>[] interfaces = theClass.getInterfaces();
    for(Class<?> interface:interfaces)
        System.out.println(interface.getSimpleName());
}

// Retrieving Type Access Modifiers
void typeModifiers(Object obj){
    Class<?> theClass = obj.getClass();
    int modifiers = theClass.getModifiers();

    if((modifiers & Modifier.FINAL) > 0)
        System.out.println("bitwise check - final");

    if(Modifier.isFinal(modifiers))
        System.out.println("method check - final");

    if(Modifier.isPrivate(modifiers))
        System.out.println("method check - private");
    else if(Modifier.isProtected(modifiers))
        System.out.println("method check - protected");
    else if(Modifier.isPublic(modifiers))
        System.out.println("method check - public");
}