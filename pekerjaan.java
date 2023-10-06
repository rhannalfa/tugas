import java.util.Scanner;

public class pekerjaan{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("PT MENCARI CINTA SEJATI");
        System.out.print("Nama Pegawai : ");
        String nama = input.nextLine();
        
        System.out.println("- Produksi");
        System.out.println("- Marketing");
        System.out.println("- Iventory");

        System.out.print("Pilih Dapertemen : ");
        String Departemen = input.nextLine();

            System.out.println("1. Pengalaman kurang dari 1 Tahun");
            System.out.println("2. Pengalaman lebih dari 1 Tahun");
            System.out.print("Pilihan  : ");
            int pengalaman = input.nextInt();

            System.out.println("");
            
            if(pengalaman == 1){
                System.out.print("Lama berkerja (bulan) : ");
                int a = input.nextInt();

                if(a >= 1 && a < 12){
                    System.out.println("==============================");
                    System.out.println("Nama Karyawan : " + nama);
                    System.out.println("Departemen : " + Departemen);
                    System.out.println("Gaji Rp.3.000.000");
                }else {
                    System.out.println("ERROR!");
                }

            }else if(pengalaman == 2){
                System.out.print("Lama bekerja (tahun) : ");
                int a = input.nextInt();
                System.out.print("Lama bekerja (bulan) : ");
                int b = input.nextInt();
                int c = a*12+b;
                if(c >= 12 && c < 24){
                    System.out.println("");
                    System.out.println("==============================");
                    System.out.println("Nama Karyawan : " + nama);
                    System.out.println("Departemen : " + Departemen);
                    System.out.println("Pengalaman Kerja: " + a + " tahun " + b + " bulan");
                    System.out.println("Gaji Rp.4.000.000");
                }else if(c>24){
                    System.out.println("");
                    System.out.println("==============================");
                    System.out.println("Nama Karyawan : " + nama);
                    System.out.println("Departemen : " + Departemen);
                    System.out.println("Pengalaman Kerja: " + (b/12 + a) + " tahun " + b%12 + " bulan");
                    System.out.println("Gaji Rp.5.000.000");
                }
            }       
    }
}

