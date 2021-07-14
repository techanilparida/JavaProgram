package test;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="apple";
		String s2="alepp";
		char s3 []= s1.toCharArray();
		char s4 [] =s2.toCharArray();
		System.out.println(Arrays.equals(s3, s4));
		Arrays.sort(s3);
		Arrays.sort(s4);
		System.out.println(Arrays.equals(s3, s4));

	}

}
