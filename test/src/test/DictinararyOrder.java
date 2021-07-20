package test;

import java.util.Arrays;

public class DictinararyOrder {

	public static void main(String[] args) {
		String [] org= {"ball","zoo","apple","yellow","king"};
		String temp="";
		for(int i=0;i<org.length;i++) {
			for(int j=i+1;j<org.length;j++) {
				
				if(org[i].compareTo(org[j])>0) {
					temp=org[i];
					org[i]=org[j];
					org[j]=temp;
				}
			}
		}
    for(String h:org) {
    	System.out.println(h);
    }
    
    String str = "Learn, Lead and Succeed in DevLabsAlliance";
    String str1=str.replaceAll("in", "with");
    System.out.println(str1);
    
    int [] fg= {4,8,0,4,0,23,0,0,56,4};
    Arrays.sort(fg);
    for(int yu:fg) {
    System.out.println(yu);	
    }
	}

}
