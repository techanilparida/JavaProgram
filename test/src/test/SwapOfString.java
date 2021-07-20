package test;

public class SwapOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1= "Hello";
		String str2="Anil";
		
		String str= str1+str2;
		System.out.println("String before swapp: "+ str1 +"  "+str2);
		str2=str.substring(0, str.length()-str2.length());
		str1= str.substring(str1.length());
		System.out.println("String after swapp: "+ str1 +"  "+str2);
		
		String [] z= {"1,2,3","1,3,4"};
		String s1 =z[0];
		System.out.println(s1.charAt(2));
		 // String [] s2 =z[1];
		int [] x= new int[10];
		
		
	}

}
