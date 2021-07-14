package test;

import java.util.ArrayList;
import java.util.HashSet;

public class Test1 {

	public static void main(String[] args) {
		int count=0;
		int [] a= {1,2,3,1,3,4,2,4,5,6,1,3,7};
		ArrayList<Integer> lst= new ArrayList<Integer>();
		ArrayList<Integer> lst1= new ArrayList<Integer>();
		for(int x:a) {
			lst.add(x);
			
		}
		HashSet<Integer> hset= new HashSet<Integer>(lst);
		System.out.println(hset);
		System.out.println(lst.size());
		
		
		for(int i=lst.size()-1;i>=0;i--) {
			if(lst.contains(lst.get(i))) {
				if(!lst1.contains(lst.get(i))) {
					
					lst1.add(a[i]);
				}
			}
			
			
		}
		
		System.out.println(lst1);
		
		
	}

}
