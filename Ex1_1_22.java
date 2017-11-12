package algsex;

import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_22 {
	   static int size = 0;
       public static int rank(int key,int[] a){
    	   size ++;
    	   StdOut.printf("%d %d\n",0,a.length-1);
    	   return rank(key,a,0,a.length-1);
       }
       
       public static int rank(int key,int []a, int lo,int hi){
    	   size ++;
    	   if(lo>hi) return -1;
    	   int mid = lo + (hi-lo)/2;
    	   if (key<a[mid]) {   
    		       StdOut.printf("%d %d\n",lo,mid-1);
    		       return rank(key,a,lo,mid-1);
    	   }
    	   else if(key>a[mid]) {
    		   StdOut.printf("%d %d\n",mid+1,hi);
    		   return rank(key,a,mid+1,hi);
    	   }
    	   else return mid;
       }
       
       public static void main(String[] args){
    	   int[] a = {1,2,3,4,5,6,7,8,9,10,11};
    	   StdOut.println(rank(7,a));
    	   StdOut.println(size);
       }
}
