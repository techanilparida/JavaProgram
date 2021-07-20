package test;

public class Pattern {
	
	public static void m1(int x) {
		for(int i=1;i<=x;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
			System.out.println();
		}
	}
	
	public static void m2(int y) {
		for(int i=y;i>=1;i--) {
			for(int j=i;j>=1;j--) {
			System.out.print("*");
		}
			System.out.println();
		}
	}
	
	public static void m3(int z) {
		for(int m=1;m<=z;m++) {
			for(int n=z-m;n>=1;n--) {
			System.out.print(" ");
		}
			for(int k=1;k<=m;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	
	public static void m4(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
			System.out.println();
		}
	}
	
	public static void m5(int b) {
		for(int i=1;i<=b;i++) {
			for(int j=1;j<=i-1;j++) {
			System.out.print(" ");
		}
			for(int l=1;l<=1;l++) {
				System.out.print("*");
			}
			for(int k=(b+b)-(i+i);k>=1;k--) {
				System.out.print(" ");
			}
				for(int m=1;m<=1;m++) {
					System.out.print("*");
				}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern.m1(5);
		System.out.println("----------------------------------");
		Pattern.m2(5);
		System.out.println("----------------------------------");
		Pattern.m3(10);
		System.out.println("----------------------------------");
		Pattern.m4(10);
		int c=65;
		System.out.println((char)c);
		//Character.toChars(c);
		//System.out.println(Character.toChars(c));
		System.out.println("----------------------------------");
		Pattern.m5(20);
		

	}

}
