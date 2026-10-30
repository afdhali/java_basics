public class Scope {
    public static void main(String[] args) {
        int x = 10; // Local variable in main method
        System.out.println("Value of x in main: " + x);

        // Calling a method that has its own local variable
        displayValue();

        // Calling a method that modifies the local variable
        modifyValue(x);
        System.out.println("Value of x after modifyValue: " + x);

        // Calling a method that demonstrates closure
        closureExample();
    }

    static void displayValue() {
        int y = 20; // Local variable in displayValue method
        System.out.println("Value of y in displayValue: " + y);
    }

    static void modifyValue(int x) {
        x = 30; // This modifies the local copy of x, not the original x in main
        System.out.println("Value of x in modifyValue: " + x);
    }

    // closure example
    static void closureExample() {
        int z = 40; // Local variable in closureExample method

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // Accessing the local variable z from the enclosing method
                System.out.println("Value of z in closure: " + z);
            }
        };

        runnable.run();
    }
}
