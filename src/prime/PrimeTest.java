package prime;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void testGetAllFactors() {
		List<Long> factors = Prime.getAllFactors(10);
		Long[] expecteds = {1L, 2L, 5L, 10L};
		
		assertArrayEquals(expecteds, factors.toArray());
	}
	
	@Test
	public void testRemoveNonPrimeNumbers(){
		List<Long> input = new LinkedList<Long>(Arrays.asList(1L, 2L, 5L, 10L));
		Prime.removeNonPrimeNumbers(input);
		Long[] expecteds = {2L, 5L};
		assertArrayEquals(expecteds, input.toArray());
	}
	
	@Test
	public void testTheMainMethod(){
		Long answer = Prime.getHighestPrimeFactor(13195);
		assertEquals(29, answer.intValue());
	}
	
	@Test
	public void testTheMainMethodForRealz(){
		Long answer = Prime.getHighestPrimeFactor(600851475143L);
		System.out.println(answer);
		
	}

}
