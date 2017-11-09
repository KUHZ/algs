package algsex;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_19 {
	public static void main(String[] args){
 	   int n = 100;
 	   long[] a = new long[n];
 	   a[0] = 0;
 	   StdOut.println(0+" "+a[0]);
 	   a[1] = 1;
 	   StdOut.println(1+" "+a[1]);
 	   for(int N = 2;N<100;N++){
 		   a[N] = a[N-1]+a[N-2];
 		   StdOut.println(N+" "+a[N]);}
    }
}
