import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class TestSimpleMath{

	@Test
	public void testSum(){
		int a = 10;
		int b = 12;
		int result = SimpleMath.sum(a,b);
		int expected = 22;
		assertTrue(expected == result);
	}

	@Test
	public void testSubstract(){
		int a = 10;
		int b = 2;
		int result = SimpleMath.substract(a,b);
		int expected = 8;
		assertTrue(expected == result);
	}

	@Test
	public void testMultiply(){
		int a = 10;
		int b = 2;
		int result = SimpleMath.multiply(a,b);
		int expected = 20;
		assertTrue(expected == result);
	}
}

