import java.util.Scanner;

public class zakat {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM MENGHITUNG ZAKAT MAL");
        System.out.print("Masukkan NIM : ");
        int input = scanner.nextInt();
        while (input > 0 )  {
            System.out.print("Masukkan Jumlah Uang yang dimiliki (Rp.): ");
            double harta = scanner.nextDouble();
            double zmal = harta * 0.25;
            System.out.println("Zakat yang harus dibayar adalah Rp. " +zmal);
            System.out.print("=================================================\n");
        }
    }
}
