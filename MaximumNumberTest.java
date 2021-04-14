package generic_Project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MaximumNumberTest {

	
		@Test
		void givenInteger_WhenMaxAtFirst_returnSame() {
			MaximumNumber maxNum =new MaximumNumber();
			int result = maxNum.getIntMaxNum(3,1,2);
			Assert.assertEquals(3, result);
		}

		@Test
		void givenInteger_WhenMaxAtsecond_returnSame() {
			MaximumNumber maxNum =new MaximumNumber();
			int result = maxNum.getIntMaxNum(20, 50, 70);
			Assert.assertEquals(70, result);
		}
		@Test
		void givenInteger_WhenMaxAtThird_returnSame() {
			MaximumNumber maxNum =new MaximumNumber();
			int result = maxNum.getIntMaxNum(20, 70, 50);
			Assert.assertEquals(70, result);
		}
	}