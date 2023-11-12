package nouveau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TuFizzBuzz {	

	@Test
	void testFizz() {
		assertEquals("fizz", FizzBuzz.check(3));	
	}
	
	@Test
	void testBuzz() {
		assertEquals("buzz", FizzBuzz.check(5));
	}
	
	@Test
	void testFizzBuzz(){
		assertEquals("fizzbuzz", FizzBuzz.check(90));
	}
	
	@Test
	void testErreur() {
		assertEquals("votre entrée ne correspond pas au limites fixées", FizzBuzz.check(101));
	}
	
	@Test
	void testAlter() {
		assertEquals(String.valueOf(98), FizzBuzz.check(98));
	}
	
	
}
