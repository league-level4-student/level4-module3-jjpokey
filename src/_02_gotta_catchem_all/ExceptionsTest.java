package _02_gotta_catchem_all;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ExceptionsTest {
	ExceptionMethods em = new ExceptionMethods();
	
	//1. This is an example of how one might test that an exception is thrown.
	//   It tests that an IndexOutOfBoundsException is thrown 
	@Test
	public void testIndexOOBException() {
		int[] vars = {0, 1, 2, 3};
			
		try {
			vars[0] = 4;
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
			vars[4] = 5;
			fail("IndexOutOfBoundsException not thrown");
			assertArrayEquals(vars, new int[] {4, 1, 2, 3});
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();			
		}
	}
	
	//2. In the ExceptionMethods class, write a method called divide that takes
	//   two doubles as parameters and returns their quotient as a double. This method 
	//   should throw an IllegalArgumentException if the denominator is 0.0.
	
	//3. Complete the JUnit test method to test the divide method.
	@Test
	public void testDivideByZeroException() {
		try {
			assertEquals(2, ExceptionMethods.Divide(4,2));
			assertEquals(4, ExceptionMethods.Divide(8,2));
			assertEquals(4, ExceptionMethods.Divide(4,0));
			assertEquals(3, ExceptionMethods.Divide(9,3));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
	}
	
	//4. In the ExceptionMethods class, write a method called reverseString that takes a
	//   String and returns the reverse of that String. It should throw an IllegalStateException
	//   if the String passed in is empty
	
	//5. Complete the JUnit test method to test the reverseStringMethod.
	@Test
	public void testReverseString() {
		try {
			assertEquals("wow", ExceptionMethods.reverse("wow"));
			assertEquals("esrever", ExceptionMethods.reverse("reverse"));
			assertEquals("ecin", ExceptionMethods.reverse("nice"));
			assertEquals("this should not work", ExceptionMethods.reverse(""));
			assertEquals("ynnufynnufynnuf", ExceptionMethods.reverse("funnyfunnyfunny"));
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
