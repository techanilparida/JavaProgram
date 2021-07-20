package test;

import java.util.Arrays;

public class SwappAndstringComapre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=15;
		int y=16;
		System.out.println(x+"  "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x+"  "+y);
		
		String str1="apple";
		String str2= "alepp";
		
		char[] arrStr = str1.toCharArray();
	    char[] arrStr1 = str2.toCharArray();

	    // sort both char[] arrays
	    Arrays.sort(arrStr);
	    Arrays.sort(arrStr1);

	    // compare sorted arrays. If sorted arrays are equal, two strings are anagram
	    System.out.println(Arrays.equals(arrStr, arrStr1));
	}

}
