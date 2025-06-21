enum EnumSingleton {

    INSTANCE;

    EnumSingleton() {
        // Initialization code here
        System.out.println("EnumSingleton instance created");
    }

    public String getInfo() {
        return "I'm an enum singleton!";
    }

    public void doSomething() {
        System.out.println("Doing something in EnumSingleton.");
    }
}
