package test;

import java.util.Arrays;

public class SecondHighInarray {

	public static void main(String[] args) {
		
		// First way
		/*
		 * int [] a= {1,4,3,2,60,12,66,66,660}; int highest=1; int second=0; int itr=2;
		 * //while(itr!=0) { for (int i=0;i<=a.length-1;i++) {
		 * 
		 * if(a[i]>highest) { second=highest; highest=a[i];
		 * 
		 * }
		 * 
		 * else if(a[i]==highest) { highest=a[i]; }
		 * 
		 * else { second=a[i]; highest=highest; //second=a[i]; } }
		 * System.out.println("First : "+highest);
		 * System.out.println("Second : "+second);
		 */

		// itr--;
		

//	}
	}
	
	// Second way
	 public int secMax(int[] numArr) {
		    // sort an array
		    Arrays.sort(numArr);

		    // return one before last. Array is soreted from smallest to biggest
		    return numArr[numArr.length - 2];
		  }


		  // secMin({4, 781, 8, 99, 103})  -> 8
		  // secMin({1, 3, 2, 4, 5})       -> 2
		  // secMin({3, 4})                -> 4

		  public int secMin(int[] numArr) {
		    // sort an array
		    Arrays.sort(numArr);

		    // return second element. Array is soreted from smallest to biggest
		    return numArr[1];
		  }

}
