public class Loops {
    public static void main(String[] args) {
        // for loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // while loop
        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // do-while loop
        System.out.println("\nDo-while loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        // Break and Continue statements
        System.out.println("\nBreak and Continue statements:");
        for (int l = 1; l <= 10; l++) {
            if (l == 5) {
                System.out.println("Breaking the loop at: " + l);
                break;
            }
            if (l % 2 == 0) {
                System.out.println("Continuing the loop at: " + l);
                continue;
            }
            System.out.println(l);
        }

        // For-each loop
        System.out.println("\nFor-each loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }

        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
