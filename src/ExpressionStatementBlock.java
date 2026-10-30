public class ExpressionStatementBlock {
    public static void main(String[] args) {
        // Contoh expression statement
        int a = 10; // Assignment statement
        int b = 20; // Assignment statement
        int c = a + b; // Expression statement

        System.out.println("Hasil penjumlahan: " + c); // Method invocation statement

        // Contoh block statement
        if (c > 20) { // Block statement
            System.out.println("c lebih besar dari 20");
        } else {
            System.out.println("c tidak lebih besar dari 20");
        }

        // Contoh block statement dengan loop
        for (int i = 0; i < 5; i++) { // Block statement
            System.out.println("Perulangan ke-" + i);
        }
    }
}
