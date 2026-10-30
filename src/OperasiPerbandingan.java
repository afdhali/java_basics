public class OperasiPerbandingan {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Operasi perbandingan
        boolean hasilSamaDengan = (x == y);
        System.out.println("Apakah x sama dengan y? " + hasilSamaDengan);

        boolean hasilTidakSamaDengan = (x != y);
        System.out.println("Apakah x tidak sama dengan y? " + hasilTidakSamaDengan);

        boolean hasilLebihBesar = (x > y);
        System.out.println("Apakah x lebih besar dari y? " + hasilLebihBesar);

        boolean hasilLebihKecil = (x < y);
        System.out.println("Apakah x lebih kecil dari y? " + hasilLebihKecil);

        boolean hasilLebihBesarAtauSamaDengan = (x >= y);
        System.out.println("Apakah x lebih besar atau sama dengan y? " + hasilLebihBesarAtauSamaDengan);

        boolean hasilLebihKecilAtauSamaDengan = (x <= y);
        System.out.println("Apakah x lebih kecil atau sama dengan y? " + hasilLebihKecilAtauSamaDengan);
    }
}
