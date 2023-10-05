import java.util.Scanner;
public class luasBangunDatar {

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menghitung Luas Bangun Datar ===");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");

        System.out.println("===========================================");
        System.out.print("Pilihan = ");
        int luas = input.nextInt();
        System.out.println("===========================================");
        switch (luas) {
            case 1:
                System.out.print("Masukan Sisi = ");
                int s = input.nextInt();
        
                System.out.println("Luas Persegi = " + (s*s));
            break;
            case 2:
                System.out.print("Masukan Alas = ");
                int a = input.nextInt();

                System.out.print("Masukan Tinggi = ");
                int t = input.nextInt();
        
                System.out.println("Luas Segitiga = " + (a*t)/(2));
            break;
            case 3:
                System.out.print("Masukan Jari-jari = ");
                int r = input.nextInt();
                double phi = 3.14;
                System.out.println("Luas Lingkaran = " + (phi)*(r*r));
            break;
        
            default:
            System.out.println("Pilihan Tidak Valid" );
                break;
        }
    input.close();
    }
}
