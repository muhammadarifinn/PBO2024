import java.util.Scanner;

public class awal {

    public static void main(String[] args) {
        // Tipe Data
        String matakuliah = "PBO";
        int nilai;
        nilai = 100;
        char abjad = 'A';

        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.println("Halo " +nama);
        System.out.print("Masukkan Nilai : ");
        int angka = input.nextInt();
        System.out.println("Nilai : " +angka);

        // nextInt = Integer
        // nextFloat = Float
        // NextShort = short
        // nextDouble = Double
        // nextBoolean = Boolean

        // Output
        System.out.println("nilai " +matakuliah+ " " +nilai +" " +abjad);
        System.out.println(matakuliah);
        System.out.println(nilai);
        System.out.println(abjad);

    }
}