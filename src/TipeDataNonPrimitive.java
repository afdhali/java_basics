public class TipeDataNonPrimitive {
    public static void main(String[] args) {
        // Deklarasi variabel non-primitive
        String name = "Alice";
        Integer age = 25;
        Double height = 1.75;
        Boolean isStudent = true;

        // Menampilkan nilai variabel non-primitive
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Tinggi: " + height);
        System.out.println("Apakah mahasiswa? " + isStudent);

        // konversi tipe data non-primitive ke tipe data primitif
        int agePrimitive = age.intValue();
        System.out.println("Umur (tipe data primitif): " + agePrimitive);

        // konversi tipe data primitif ke tipe data non-primitive
        Double heightNonPrimitive = Double.valueOf(height);
        System.out.println("Tinggi (tipe data non-primitive): " + heightNonPrimitive);
        int agePrimitive2 = 15;
        Integer ageNonPrimitive2 = agePrimitive2; // Autoboxing
        System.out.println("Umur (tipe data non-primitive): " + ageNonPrimitive2);
    }
}
