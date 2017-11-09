package algsex;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_20 {
     public static double ln(Double N){
    	 if(N > 0)return Math.log(N) + ln(N-1);
		return -1;
     }
     
     public static void main(String[] args){
    	 double N = 2;
    	 StdOut.println(ln(N));
     }
}
