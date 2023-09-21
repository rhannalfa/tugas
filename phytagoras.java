package Pertemuan3;

import java.util.Scanner;
public class phytagoras {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
            System.out.print("Masukan A = ");
            int A = input.nextInt();
            System.out.print("Masukan B = ");
            int B = input.nextInt();
            double C = ((A*A)+(B*B));
            System.out.print("Mencari C = " + Math.sqrt(C));
    }
}
