package test;

public class PrimeTwo {

	public static void main(String[] args) {
		int num=33;
		int count=0;
		
	if (num==1) {
		System.out.println(num+ " is not a prime Number");
	}
	else if(num==2) {
		System.out.println(num+ " is a prime number");
	}
	else {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count!=0) {
			System.out.println("It is not a prime Number");
		}
		else {
			System.out.println("It is a prime number");
		}
	}
	
	}

}
