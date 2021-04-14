package generic_Project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumStringTest {

	@Test
	void givenStrings_whenMaxAtFirst_returnSame() {
		MaximumString maxString = new MaximumString();
	        String result = maxString.getMaxstring("peach", "apple", "banana");
	        Assertions.assertEquals( "peach", result);
	  
	}
	@Test
	void givenStrings_whenMaxAtsecond_returnSame() {
		MaximumString maxString = new MaximumString();
	        String result = maxString.getMaxstring("apple", "peach", "banana");
	        Assertions.assertEquals( "peach", result);
	  
	}
	@Test
	void givenStrings_whenMaxAtThird_returnSame() {
		MaximumString maxString = new MaximumString();
	        String result = maxString.getMaxstring( "banana","peach","apple");
	        Assertions.assertEquals( "peach", result);
	  
	}
}
