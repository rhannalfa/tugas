import java.util.Scanner;
class nested {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");

        System.out.print("Silahkan Pilih 1/2/3 : ");
        int A = input.nextInt();
        if(A == 1){
            System.out.println("PROGRAM MENGHITUNG PERSEGI");
            System.out.println("1. LUAS PERSEGI");
            System.out.println("2. KELILING PERSEGI");
            System.out.print("Silahkan Pilih 1/2/ : ");
            int B = input.nextInt();
            if(B == 1){
                System.out.println("MENGHITUNG LUAS PERSEGI");
            }else if(B==2){
                System.out.println("MENGHITUNG KELILING PERSEGI");
            }else{
                System.out.println("PILIHAN TIDAK ADA");
            }
        }else if(A == 2){
            System.out.println("PROGRAM MENGHITUNG SEGITIGA");
            System.out.println("1. LUAS SEGITIGA");
            System.out.println("2. KELILING SEGITIGA");
            System.out.print("Silahkan Pilih 1/2/ : ");
            int B = input.nextInt();
            if(B == 1){
                System.out.println("MENGHITUNG LUAS SEGITIGA");
            }else if(B==2){
                System.out.println("MENGHITUNG KELILING SEGITIGA");
            }else{
                System.out.println("PILIHAN TIDAK ADA");
            }
        }else if(A == 3){
            System.out.println("PROGRAM MENGHITUNG LINGKARAN");
            System.out.println("1. LUAS LINGKARAN");
            System.out.println("2. KELILING LINGKARAN");
            System.out.print("Silahkan Pilih 1/2/ : ");
            int B = input.nextInt();
            if(B == 1){
                System.out.println("MENGHITUNG LUAS LINGKARAN");
            }else if(B==2){
                System.out.println("MENGHITUNG KELILING LINGKARAN");
            }else{
                System.out.println("PILIHAN TIDAK ADA");
            }
        }else{
                System.out.println("PILIHAN TIDAK ADA");
        }
    }
}
