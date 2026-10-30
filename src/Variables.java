public class Variables {
    public static void main(String[] args) {
        // Deklarasi variabel
        int age = 25;
        double height = 1.75;
        boolean isStudent = true;

        // Menampilkan nilai variabel
        System.out.println("Umur: " + age);
        System.out.println("Tinggi: " + height);
        System.out.println("Apakah mahasiswa? " + isStudent);

        // Var
        var name = "Alice";
        var score = 95.5;
        System.out.println("Nama: " + name);
        System.out.println("Skor: " + score);

        score = 10;
        System.out.println("Skor baru: " + score);

        // sama seperti const
        final double PI = 3.14159;
        System.out.println("Nilai PI: " + PI);
    }
}
