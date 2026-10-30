public class OperasiBoolean {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Operasi logika AND
        boolean hasilAND = a && b;
        System.out.println("Hasil AND (a && b): " + hasilAND);

        // Operasi logika OR
        boolean hasilOR = a || b;
        System.out.println("Hasil OR (a || b): " + hasilOR);

        // Operasi logika NOT
        boolean hasilNOT = !a;
        System.out.println("Hasil NOT (!a): " + hasilNOT);
    }
}
