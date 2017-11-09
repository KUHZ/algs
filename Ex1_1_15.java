package algsex;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_15 {
       public static int[] histogram(int[] a,int M){
		   int[] b = new int[M];
		   for(int i=0;i<M;i++){
			   int count = 0;
			   for(int j=0;j<a.length;j++){
				   if(a[j]==i)count++;
			   }
			   b[i]=count;
			   //StdOut.println(b[i]);
		   }
    	   return b;
       }
       public static void main(String args[]){
    	   int[] a = new int[args.length-1];
    	   StdOut.println("length of a[]: "+a.length);
    	   for(int i = 0;i<args.length-1;i++){
    		   a[i] = Integer.parseInt(args[i]);
    		   //StdOut.println(a[i]);
    	   }
    	   int M = Integer.parseInt(args[args.length-1]);
    	   //StdOut.println(M);
    	   int[] b = histogram(a,M);
    	   int sum =0;
    	   for(int i =0;i<b.length;i++){
    		   sum +=b[i];
    		   StdOut.println(b[i]);
    	   }
    	   StdOut.println("sum: "+sum);
       }
}
