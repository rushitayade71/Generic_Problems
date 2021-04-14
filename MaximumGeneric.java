package generic_Project;

public class MaximumGeneric {

	 public static <T extends Comparable<T>> T testMax(T x, T y ,T z){
	        T max = x;
	        if(y.compareTo(max) > 0)
	            max = y;
	        if(z.compareTo(max) > 0)
	            max = z;
	        return max;
	    }

	    public static void main(String[] args) {
	        System.out.println(MaximumGeneric.testMax(3,2,1));
	        System.out.println(MaximumGeneric.testMax(123.3f,1.1f,97.33f));
	        System.out.println(MaximumGeneric.testMax("peach","banana","apple"));

	    }
	}
