public class TipeDataArray {
    public static void main(String[] args) {
        // Deklarasi array
        int[] arrayAngka = new int[5];

        // Inisialisasi array
        arrayAngka[0] = 10;
        arrayAngka[1] = 20;
        arrayAngka[2] = 30;
        arrayAngka[3] = 40;
        arrayAngka[4] = 50;

        // Menampilkan isi array
        System.out.println("Isi Array:");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("Index " + i + ": " + arrayAngka[i]);
        }

        String[] arrayNama = {"Alice", "Bob", "Charlie", "David", "Eve"};
        System.out.println("\nIsi Array Nama:");
        for (int i = 0; i < arrayNama.length; i++) {
            System.out.println("Index " + i + ": " + arrayNama[i]);
        }

        // Menggunakan array multidimensi
        int[][] array2D = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("\nIsi Array Multidimensi:");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print("Index [" + i + "][" + j + "]: " + array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
