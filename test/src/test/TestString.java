package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestString {

	public static void main(String[] args) {
		String str= new String("abcd");
		
		String str3= str.substring(1,3);
		str=str.replace('a', 'E');
	//	str=str.replaceAll("[0-9]", "1");
		String str4="efgh";
		str4=str4.replace('g', 'h');
		System.out.println(str);
		String st1="tyyy";
		String st2="tyyyz";
		System.out.println(st1+st2);
		Map<String,String> map= new LinkedHashMap<String, String>();
		map.put("1", "anil");
		map.put("2", "anil");
		int k=5;
		System.out.println(""+ k +"");
		Set<String> x=map.keySet();
	
	    System.out.println(map.size());
	    for (int l=1;l<10;l++) {
	    	map.put(""+l+"", "test");
	    }
		for (String a:map.keySet()) {
			
			System.out.print(a +"="+ map.get(a) +a+ "  ,  ");
		}
		System.out.println(map.get(x));
		System.out.println(map.keySet());
		
		int y=1234;
		int z=10;
		System.out.println(y%z);
		
		String s="xyz";
		System.out.println(s.contains("xyzc"));
		
		ArrayList<String> list=new ArrayList<String>();  
        list.add("Ravi");  
        list.add("Vijay");  
        list.add("Ajay");  
        HashSet set=new HashSet(list);  
        set.add("Gaurav");  
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());
		

	}

	}}
