package test;


public class Fact {

	public static void main(String[] args) {
		long x=100;
		double fact=1;
		 for (int i=(int) x;i>=1;i--) {
			 fact=fact*i;
		 }
		 System.out.println(fact);
	}

}
