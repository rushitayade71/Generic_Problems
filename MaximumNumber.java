package generic_Project;

public class MaximumNumber {

	public int getIntMaxNum(Integer x, Integer y, Integer z) {
	   	if (x.compareTo(y) > 0) {
	      	if (x.compareTo(z) > 0) {
	         	return x;
	      	}
	    	}
	      if (y.compareTo(z) > 0) {
	        	return y;
	      }
	      	return z;
	    	}
		public static void main(String args[]){

			System.out.println("Welcome to Maximum of given arrengment");
		} 
	}
