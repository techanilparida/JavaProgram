package test;

import java.util.HashMap;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		/*
		 * Scanner scn= new Scanner(System.in); String inp= scn.nextLine(); int count=1;
		 * String org= ""; for (int i=0;i<inp.length();i++) {
		 * 
		 * if(inp.charAt(i)==' ') { count++; }else { org=org+inp.charAt(i); }
		 * 
		 * while(inp.charAt(i)!=' ') { org=org+inp.charAt(i); }
		 * 
		 * } System.out.println(count + "words are there in the given sentence");
		 */
		
		
		 String str = "This this is is done by Saket Saket";
	        String[] split = str.split(" ");
	        for(String x:split) {
	        	System.out.print(x);
	        }
	        
	         
	        HashMap<String,Integer> map = new HashMap<String,Integer>();
	        for (int i=0; i<split.length; i++) {
	            if (map.containsKey(split[i])) {
	                int count = map.get(split[i]);
	                map.put(split[i], count+1);
	            }
	            else {
	                map.put(split[i], 1);
	            }
	        }
	        System.out.println(map);
	}

}
