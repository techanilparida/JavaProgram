package test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;



public class Prime {

	public static void main(String[] args) {
		int count=0;
		String prime="2"+ " "+"3";
		//prime= prime+2;
		
		for(int i=4;i<=100;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				prime= prime+" "+i;
			}
			count=0;
		}
		System.out.println("Prime Numbers are : "+prime);
		
		ArrayList<Integer> dem= new ArrayList<Integer>();
		dem.add(1);
		dem.add(45);
		dem.add(4);
		dem.add(34);
		System.out.println(dem);
		Collections.sort(dem);
		System.out.println(dem);
		int y=Collections.max(dem);
		System.out.println(y);
		System.out.println(dem);
		HashSet<Integer> has= new HashSet<Integer>(dem);
		for(int x:has) {
			System.out.println(x);
		}
		
		
	}

}
