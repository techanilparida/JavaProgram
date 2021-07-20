package test;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// List to Array
		
		List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

       Integer[] intArray = new Integer[intList.size()];
        intArray = intList.toArray(intArray);

        for(Integer i : intArray)
            System.out.println(i);
	
	
	//Array To List
	List<Integer> intList1 = new ArrayList<Integer>();

	for(int x: intArray) {
		intList1.add(x);
	}
	
	System.out.println(intList1);
	}
	

}
