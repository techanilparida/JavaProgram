package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.TreeSet;

public class CollectionPractice {

	public static void main(String[] args) {
		ArrayList<String> s1= new ArrayList<String>();
		s1.add("anil");
		s1.add("soumya");
		s1.add("awllo");
		s1.add("anil");
		ArrayList<String> s3= new ArrayList<String>();
		s3.add("1");
		s3.add("5");
		ArrayList<Integer> s2= new ArrayList<Integer>();
	
		s2.add(10);
		s2.add(56);
		s2.add(45);
		s2.add(799);
		s1.addAll(s3);
		s1.set(2, "warner");
		Integer [] x= new Integer[s2.size()];
	     x=s2.toArray(x);
	     Arrays.sort(x);
	     System.out.println(x[1]);
	     System.out.println(x.getClass());
	     List<Integer> s5=  Arrays.asList(x);
	     System.out.println(s5.getClass());
		// Check add all method
		System.out.println(s1);
		String maxi=Collections.min(s3);
		System.out.println(maxi);
		System.out.println(s2);
		Collections.sort(s2);
		System.out.println(s2.get(0));
		HashSet<String> set1= new HashSet<String>();
		set1.addAll(s1);
		
		System.out.println(set1);
		TreeSet<Integer> df= new TreeSet<Integer>();
		
		df.add(1);
		for(int i:df) {
			System.out.println(i);
		}
		df.subSet(0, 1);
		char ft='g';
		char gt='a';
		
		ArrayList<Integer> s6= new ArrayList<Integer>();
		s6.add(11);
		s6.add(3);
		s6.add(1111);
		s6.add(1);
		s6.add(111);
		System.out.println(s6);
		TreeSet<Integer> tr= new TreeSet<Integer>(s6);
		System.out.println(tr);
		Properties p= new Properties();
		
		
		
		
		

	}

}
