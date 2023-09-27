public class operatorLogika {
    public static void main(String [] args){
		int  A = 3; 
        int  B = 6; 
        int  C = 2; 
        int  K = 5; 
        int  L = 4; 
        int  M = 3;
        System.out.print("a. ");
	System.out.println((4 + 2 > A) && (B - 2 > 3 + 2) || (B + 2 <= 6 + 2));
	    
        System.out.print("b. ");
        System.out.println((K + 5 < M) || (C * M < L) && (2 * M - L > 0));
	    
        System.out.print("c. ");
        System.out.println((L + 5 < M) || (C * K < L) && (2 * K - L > 0));
	    
        System.out.print("d. ");
        System.out.println(A * 4 <= 3 * M + B);
	    
        System.out.print("e. ");
        System.out.println((K + 10 > A) && (L - 2 > 4 * C));
    }
}

