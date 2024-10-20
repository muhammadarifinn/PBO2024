import java.util.Scanner;
public class tugas {
    // PROGRAM MENGHITUNG ZAKAT MAAL
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("PROGRAM MENGHITUNG ZAKAT");
            //2,5kg x perjiwa
            System.out.println("1. Zakat Fitrah"); 
            // harta * 0,25%
            System.out.println("2. Zakat Mal (harta)"); 
            //1gr emas = 50k, zakat yang dibayar => 100gr x 50k x 2.5% = 125k.
            System.out.println("3. Zakat Emas dan Perak"); 
            System.out.println("4. Exit");
            System.out.print("Masukkan Pilihan : ");
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Jumlah Orang: ");
                    int jiwa = scanner.nextInt();
                    double zfit = 2.5 * jiwa;
                    System.out.println("Zakat yang harus dibayar adalah " +zfit +"Kg");
                    System.out.print("=================================================\n");
                    break;
                case 2:
                    System.out.print("Masukkan Jumlah Uang yang dimiliki (Rp.): ");
                    double harta = scanner.nextDouble();
                    double zmal = harta * 0.25;
                    System.out.println("Zakat yang harus dibayar adalah Rp. " +zmal);
                    System.out.print("=================================================\n");
                    break;
                case 3:
                    System.out.print("Masukkan Jumlah Emas : ");
                    double emas= scanner.nextDouble();
                    double zema = emas * 1500000  * 0.025; 
                    System.out.println("Zakat yang harus dibayar adalah Rp. " +zema);
                    System.out.print("=================================================\n");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
                    break;
            }
        } while (pilih != 4);
        
    }
}
