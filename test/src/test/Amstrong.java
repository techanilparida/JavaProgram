package test;

public class Amstrong {

	public static void main(String[] args) {
		int x=2345;
		int res=0;
		while(x!=0) {
			int num=x%10;
			 res=res+(num*num*num*num);
			System.out.println(num);
			x=x/10;
		}
		System.out.println(res);

	}

}
