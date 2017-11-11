package algsex;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_21 {
	public static String[] read() {
		String line;
		String[] temp = new String[3];
        line = StdIn.readLine();
		temp = line.split(" ");
        return temp;
	}

	public static void main(String args[]) {
		String[] input = new String[3];
        if(StdIn.isEmpty())
        	StdOut.println("no data put in");
        else{
        	while(StdIn.hasNextLine()){
        		input = read();
        		double a = Double.parseDouble(input[1]);
        		double b = Double.parseDouble(input[2]);
        		double c = a/b;
        		StdOut.printf("%s %.0f %.0f %.3f\n",input[0],a,b,c );
        	}
        }
	}
}
