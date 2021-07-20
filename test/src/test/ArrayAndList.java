package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayAndList {

	public static void main(String[] args) {
		ArrayList<String> test1= new ArrayList<String>();
		test1.add("test1");
		test1.add("test2");
		test1.add("test3");
		test1.add("test4");
		test1.add("test5");
		test1.add("test6");
		test1.add("test7");
		System.out.println(test1.subList(1, 3));
		System.out.println(test1.size());
		System.out.println(test1.contains("test1"));
		test1.remove(0);
		System.out.println(test1.get(0));
		System.out.println(test1.size());
		String [] b=(String[]) test1.toArray();
		String [] xy= {"10","20","30","40"};
		System.out.println(xy.length);
		List<String> bv=Arrays.asList(xy);
		System.out.println(Arrays.asList(xy).getClass());
		System.out.println(xy.toString());
		
		StringBuffer st= new StringBuffer("abd");
		
		HashSet<String>  sets=new HashSet<String>();
		HashSet<String>  sets1=new HashSet<String>();
		sets.add("testing");
		System.out.println(sets.toString().getClass());
		sets.addAll(sets1);
		
		

	}

}
