package com.rayan.tdd_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirstTwoAATest {
/* 1.ABCD => BCD
 * 2.AACD => CD
 * 3.BACD => BCD
 * 4.BBAA => BBAA
 * 5.AABAA => BAA
 * 6."" => ""
 * 
 */
	RemoveFirstTwoA a;
	@BeforeEach
	void setUp()
	{
		a = new RemoveFirstTwoA();
		}
	@Test
	void testoneAatfirst_nofurtherA() {
		
		assertEquals("BCD",a.remove("ABCD"));
	}
	@Test
	void testTwoAatFirst_nofurtherA() {
		
		assertEquals("CD",a.remove("AACD"));
	}
@Test
void testoneAatsecond_nofurtherA()
{
	
	assertEquals("BCD",a.remove("BACD"));
}
@Test
void testNoAatfirsttwo_furtherA()
{
	
	assertEquals("BBAA",a.remove("BBAA"));
}
@Test
void testAatfirsttwo_furtherA()
{
	
	assertEquals("BAA",a.remove("AABAA"));
	}
@Test
void emptyString()
{
	
	assertEquals("",a.remove(""));
	
}

}
