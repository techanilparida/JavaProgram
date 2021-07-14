package test;

public class Highest {

	public static void main(String[] args) {
		int [] a= {999,222,5,34,111,56,23,78,89,34,900};
		int highest=1;
		int secondhighest=0;
		for(int i=0;i<a.length;i++) {
			if(highest>a[i]) {
				highest=highest;
				if(secondhighest<a[i]) {
					secondhighest=a[i];	
				}
				
			}
			else {
				secondhighest=highest;
				highest=a[i];
				
			}
		}
		System.out.println("Highest Num : "+highest);
		System.out.println("Second Heighest Num : "+secondhighest);
	}

}
