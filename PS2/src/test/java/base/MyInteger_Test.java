package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	MyInteger value = new MyInteger(3);
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_get_iValue() {
		assertEquals(value.get_iValue(), 3);
	}
	
	@Test
	public void test_isEven() {
		assertFalse(value.isEven());
	}
	@Test
	public void test_isOdd() {
		assertTrue(value.isOdd());
	}
	@Test
	public void test_isPrime() {
		assertTrue(value.isPrime());
	}
	
	@Test
	public void test_isEven_Static() {
		assertTrue(MyInteger.isEven(4));
		assertFalse(MyInteger.isEven(5));
		assertTrue(MyInteger.isEven(10000));
		assertFalse(MyInteger.isEven(10001));
	}
	
	@Test
	public void test_isOdd_Static(){
		assertFalse(MyInteger.isOdd(4));
		assertTrue(MyInteger.isOdd(5));
		assertFalse(MyInteger.isOdd(10000));
		assertTrue(MyInteger.isOdd(10001));
	}
	
	@Test
	public void test_isPrime_Static() {
		assertFalse(MyInteger.isPrime(4));
		assertTrue(MyInteger.isPrime(5));
		assertFalse(MyInteger.isPrime(25));
		assertTrue(MyInteger.isPrime(997));
	}
	
	@Test
	public void test_isEven_MyInt() {
		assertFalse(MyInteger.isEven(value));
	}
	
	@Test
	public void test_isOdd_MyInt() {
		assertTrue(MyInteger.isOdd(value));;
	}
	
	@Test
	public void test_isPrime_MyInt() {
		assertTrue(MyInteger.isPrime(value));
	}
	
	@Test
	public void test_equals() {
		assertTrue(MyInteger.equals(3));
		assertFalse(MyInteger.equals(4));
	}
	
	@Test
	public void test_equals_MyInt() {
		assertTrue(MyInteger.equals(value));
	}
}