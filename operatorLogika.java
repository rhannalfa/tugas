package Pertemuan3;
public class operatorLogika {
    public static void main(String [] args){
	int  A = 3; 
        int  B = 6; 
        int  C = 2; 
        int  K = 5; 
        int  L = 4; 
        int  M = 3;
	    
	System.out.println("1" + 4 + 2 > A && B - 2 > 3 + 2 || B + 2 <= 6 + 2);
        System.out.println("2" + K + 5 < M || C * M < L && 2 * M - L > 0);
        System.out.println("3" + L + 5 < M || C * K < L && 2 * K - L > 0);
        System.out.println("4" + A * 4 <= 3 * M + B);
        System.out.println("5" + K + 10 > A && L - 2 > 4 * C);
    }
}
