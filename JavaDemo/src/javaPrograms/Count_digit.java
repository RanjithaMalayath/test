package javaPrograms;

public class Count_digit {


	 public static void main (String[] args) {
	        int N = 11001;
	         
	       
	     int rev = 0; // reversed number
	     // int enable_print;   // remainder
	       
	      while(N>0){
	          
	       int  enable_print = N%10;
	        rev = (rev*10) + enable_print;
	        N = N/10;
	      }
	       
	      //return rev;
	      System.out.println(rev);
	    }
}
	     
	
	    	
	    