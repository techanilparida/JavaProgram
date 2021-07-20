package test;

public class Fibo {

	public static void main(String[] args) {
		int x= 5;
		int a=0;
		int b=1;
		int c=a+b;
		System.out.println(a);
		System.out.println(b);
		for (int i=0;i<=x;i++) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
		

	}

}
