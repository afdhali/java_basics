public class OperasiMatematika {
    public static void main(String[] args) {
        // Operasi penjumlahan
        int a = 10;
        int b = 5;
        int hasilPenjumlahan = a + b;
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);

        // Operasi pengurangan
        int hasilPengurangan = a - b;
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);

        // Operasi perkalian
        int hasilPerkalian = a * b;
        System.out.println("Hasil Perkalian: " + hasilPerkalian);

        // Operasi pembagian
        double hasilPembagian = (double) a / b;
        System.out.println("Hasil Pembagian: " + hasilPembagian);

        // Operasi modulus
        int hasilModulus = a % b;
        System.out.println("Hasil Modulus: " + hasilModulus);

        // Augmentasi dan dekrementasi
        a += 2; // a = a + 2
        System.out.println("Nilai a setelah augmentasi: " + a);
        b--; // b = b - 1
        System.out.println("Nilai b setelah dekrementasi: " + b);
        a *= 3; // a = a * 3
        System.out.println("Nilai a setelah perkalian: " + a);
        b /= 2; // b = b / 2
        System.out.println("Nilai b setelah pembagian: " + b);

        // unari operator
        int c = 5;
        int hasilUnari = -c; // Negasi
        System.out.println("Hasil Unari (Negasi): " + hasilUnari);
    }
}
