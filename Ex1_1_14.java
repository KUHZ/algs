package algsex;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_14 {
       public static int lg(String a){
    	   int N = Integer.parseInt(a);
    	   int result = 0;
    	   while(N/2>=1){
    		   ++result;
    		   N/=2;
    	   }
    	   return result;
       }
       public static void main(String[] args){
    	   StdOut.println(lg(args[0]));
    	   
       }
}
