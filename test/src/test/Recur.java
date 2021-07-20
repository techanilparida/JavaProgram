package test;

public class Recur {
	static int fc;
	public static int m1(int n) {
		if (n <= 1) {
	         return 1;
		}
	      else {
	    	  
	         return n * m1(n-1);
	      }
	   }
	   public static void main(String args[]) {
	      System.out.println("The factorial of 6 is: " + m1(6));
	      //System.out.println("The factorial of 0 is: " + m1(0));
		   Recur.m1(6);
	   }


}
