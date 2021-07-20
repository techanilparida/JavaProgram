package test;

public class Regularexp {

	public static void main(String[] args) {
		String val="abcd##@%GggggffGGGfDD12#*&6655%4$6$";
		val=val.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(val);
		int n=145/10;
		System.out.println(n);
		String str1 = "Saket Saurav        is a QualityAna    list";
		
		str1=str1.replaceAll("[^a-zA-Z0-9] ", "");
		System.out.println(str1);
		
		  
        //1. Using replaceAll() Method
  
        String str2 = str1.replaceAll("\\s", "");
        
        System.out.println(str2);
        String[] intArray = new String[10];

	}

}
