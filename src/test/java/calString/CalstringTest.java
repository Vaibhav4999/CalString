package calString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalstringTest {

	@Test
	void empty_string_should_return_0() throws Exception {
		 CalString stringCalculator = new  CalString();
		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	void string_with_single_number_should_return_number_as_int() throws Exception {
		 CalString stringCalculator = new  CalString();
		assertEquals(1, stringCalculator.add("1"));
	}
	
	@Test
	void string_with_multiple_number_should_return_number_as_int() throws Exception {
		 CalString stringCalculator = new  CalString();
		assertEquals(10, stringCalculator.add("1,2,3,4"));
	}
	
	
}

