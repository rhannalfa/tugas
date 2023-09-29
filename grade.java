import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
    	
        // Getting float input
        System.out.print("Nama     : ");
        String Name = input.nextLine();
    	
        // Getting double input
        System.out.print("NIM      : ");
        int Nim = input.nextInt();
    	
        System.out.print("Tugas    : ");
        int Tugas = input.nextInt();

        System.out.print("UTS      : ");
        int UTS = input.nextInt();

        System.out.print("UAS      : ");
        int UAS = input.nextInt();

        double Akhir = Tugas*30/100 + UTS*30/100 + UAS*40/100;
        
        System.out.println("===== Data Nilai Mahasiswa =====");
        System.out.println("Nama = " + Name);
        System.out.println("NIM = " + Nim);
        System.out.println("Tugas = " + Tugas);
        System.out.println("UTS = " + UTS);
        System.out.println("UAS = " + UAS);
        System.out.println("Nilai Akhir = " + Akhir);
        System.out.println("================================");
        
        if(Akhir >= 80){ 
            System.out.println("Grade = A");
        } else if(Akhir >= 70 && Akhir < 80){
            System.out.print("Grade = B");
        } else if(Akhir >= 60 && Akhir < 70){
            System.out.print("Grade = C");
        } else if(Akhir >= 50 && Akhir < 60){
            System.out.print("Grade = D");
        } else{
            System.out.print("Grade = E");
        }
    }
}
