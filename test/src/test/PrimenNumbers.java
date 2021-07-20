package test;

public class PrimenNumbers {

	public static void main(String[] args) {
	int x= 100;
	int count=0;
	 for (int i=2;i<=x;i++) {
		 
		 for(int j=2;j<i;j++) {
			 if(i%j==0) {
				count+=1;
			 }}
		if(count==0) {
		System.out.println(i);
			 }
		
		count=0;
			 
		 
		 
	 }

	}

}
