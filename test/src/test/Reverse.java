package test;

import java.util.HashMap;

public class Reverse {

	public static void main(String[] args) {
		
		// String Reverse
		String s1="abcdefgh";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
			
		}
		System.out.println(rev);

		// Integer reverse
		int i1=123456;
		int rev1=0;
		while(i1>0) {
			rev1=rev1*10+i1%10;
			i1= i1/10;
		}
		System.out.println(rev1);
		
		// Using String buffer
		String s2 = "automate";
		StringBuffer buf= new StringBuffer(s2);
	     buf.reverse();
		System.out.println(buf);
		
		//Swapping---1
		String x="anil";
		String y="parida";
		System.out.println("Before swapping  "+x+"   "+y);
		String temp="";
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping  "+x+"   "+y);
		
		//Swapping ---2
		
		String a= "anil";
		String b= "parida";
		System.out.println("Before swapping  "+a+"   "+b);
		String z=a+b;
		b=z.substring(0,z.length()-b.length());
		a=z.substring(b.length());
		
		System.out.println("after swapping  "+a+"   "+b);
		
		//Swapping ---3
		
		int i=45; 
		int j=67;
		System.out.println("Before swapping  "+i+"   "+j);
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("after swapping  "+i+"   "+j);
				
		// Counting no of words in a string using map
		 
		int count=0;
		String w="This is a book and this is a pen";
		String word []= w.split(" ");
		int len= word.length;
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		for(int k=0;k<len;k++) {
			if(map.containsKey(word[k])) {
				map.put(word[k], map.get(word[k])+1);
			}
			else {
				map.put(word[k], 1);
			}
		}
		
		System.out.println(map);
		
		// Fibonacy series
		int f=0;
		int g=1;
		int h=f+g;
		System.out.print(f +" "+g +" "+h);
		for(int n=0;n<7;n++) {
			f=g;
			g=h;
			h=f+g;
			System.out.print(" "+h);
		}
		
		
		
		
		
	}

}
