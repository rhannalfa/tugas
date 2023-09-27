import java.util.Scanner;
public class phytagoras {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Rumus Phytagoras Segitiga Siku-Siku ===");
        System.out.println("1. Mencari Sisi Miring");
        System.out.println("2. Mencari Sisi Alas");
        System.out.println("3. Mencari Sisi Tinggi");

        System.out.println("===========================================");
        System.out.print("Pilihan = ");
        int a = input.nextInt();
        System.out.println("===========================================");
        if(a == 1){
            System.out.print("Masukan Sisi Alas = ");
            int A = input.nextInt();
            System.out.print("Masukan Sisi Tinggi = ");
            int B = input.nextInt();
            int C = ((A*A)+(B*B));
            System.out.println("Sisi Miring = " + Math.sqrt(C));

        }else if(a == 2){
            System.out.print("Masukan Sisi Tinggi = ");
            int B = input.nextInt();
            System.out.print("Masukan Sisi Miring = ");
            int C = input.nextInt();
            int A = ((B*B)-(C*C));
            System.out.println("Sisi Alas = " + Math.sqrt(Math.sqrt(A*A)));

        }else if(a == 3){
            System.out.print("Masukan Sisi Alas= ");
            int A = input.nextInt();
            System.out.print("Masukan Sisi Miring = ");
            int C = input.nextInt();
            int B = (A*A-C*C);
            System.out.println("Sisi Tinggi = " + Math.sqrt(Math.sqrt(B*B)));
        }else{
            System.out.print("Pilihan anda salah!!");
        }
        System.out.println("===========================================");
    }
}
