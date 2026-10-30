public class Method {
    public static void main(String[] args) {
        // Calling a method without parameters
        greet();

        // Calling a method with parameters
        int sumResult = add(5, 10);
        System.out.println("Sum: " + sumResult);

        // Calling a method that returns a value
        String message = getMessage();
        System.out.println("Message: " + message);

        int[] numbers = {1, 2, 3, 4, 5};
        // Calling a method with variable number of arguments (varargs)
        int totalSum = sum(numbers);
        System.out.println("Total Sum: " + totalSum);

        // Calling overloaded methods
        int product1 = multiply(2, 3);
        int product2 = multiply(2, 3, 4);
        System.out.println("Product (2 params): " + product1);
        System.out.println("Product (3 params): " + product2);

        // Calling a method with a return type of void
        printMessage("This is a message from the printMessage method.");
        // Calling a method with a return type of void and no parameters
        printHello();

        // Calling a recursive method
        int factorialResult = factorial(5);
        System.out.println("Factorial of 5: " + factorialResult);
    }

    // Method without parameters
    static void greet() {
        System.out.println("Hello, welcome to the Method class!");
    }

    // Method with parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Method that returns a value
    static String getMessage() {
        return "This is a message from the getMessage method.";
    }


    // Method with variable number of arguments (varargs)
    static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // Method overloading example
    static int multiply(int a, int b) {
        return a * b;
    }

    // Overloaded method with three parameters
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method with a return type of void
    static void printMessage(String message) {
        System.out.println(message);
    }

    // Method with a return type of void and no parameters
    static void printHello() {
        System.out.println("Hello from the printHello method!");
    }

    // recursive method example
    static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
}
