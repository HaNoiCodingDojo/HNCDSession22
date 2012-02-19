package test;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.Test;

public class RomanNumeralTest {

	// @Test
	// public final void testtestframework() {
	// Assert.assertEquals(true, true);
	// }

	@Test
	public final void test1IsConvertedIntoI() {
		Assert.assertEquals("I", RomanNumeral.convert(1));
	}

	@Test
	public final void test2IsConvertedIntoII() {
		Assert.assertEquals("II", RomanNumeral.convert(2));
	}

	@Test
	public final void test3IsConvertedIntoIII() {
		Assert.assertEquals("III", RomanNumeral.convert(3));
	}

	@Test
	public final void test4IsConvertedIntoIV() {
		Assert.assertEquals("IV", RomanNumeral.convert(4));
	}

	@Test
	public final void test5IsConvertedIntoV() {
		Assert.assertEquals("V", RomanNumeral.convert(5));
	}

	@Test
	public final void test6IsConvertedIntoVI() {
		Assert.assertEquals("VI", RomanNumeral.convert(6));
	}

	@Test
	public final void test7IsConvertedIntoVII() {
		Assert.assertEquals("VII", RomanNumeral.convert(7));
	}

	@Test
	public final void test8IsConvertedIntoVIII() {
		Assert.assertEquals("VIII", RomanNumeral.convert(8));
	}

	@Test
	public final void test9IsConvertedIntoIX() {
		Assert.assertEquals("IX", RomanNumeral.convert(9));
	}

	@Test
	public final void test10IsConvertedIntoX() {
		Assert.assertEquals("X", RomanNumeral.convert(10));
	}

	@Test
	public final void test11IsConvertedIntoXI() {
		Assert.assertEquals("XI", RomanNumeral.convert(11));
	}

	@Test
	public final void test14IsConvertedIntoXIV() {
		Assert.assertEquals("XIV", RomanNumeral.convert(14));
	}

	@Test
	public final void test19IsConvertedIntoXIX() {
		Assert.assertEquals("XIX", RomanNumeral.convert(19));
	}

	@Test
	public final void test15IsConvertedIntoXV() {
		Assert.assertEquals("XV", RomanNumeral.convert(15));
	}

	@Test
	public final void test20IsConvertedIntoXX() {
		Assert.assertEquals("XX", RomanNumeral.convert(20));
	}

	@Test
	public final void test21sConvertedIntoXXI() {
		Assert.assertEquals("XXI", RomanNumeral.convert(21));
	}

	@Test
	public final void test40sConvertedIntoXL() {
		Assert.assertEquals("XL", RomanNumeral.convert(40));
	}

	@Test
	public final void test50sConvertedIntoL() {
		Assert.assertEquals("L", RomanNumeral.convert(50));
	}

	@Test
	public final void test41sConvertedIntoXLI() {
		Assert.assertEquals("XLI", RomanNumeral.convert(41));
	}
	
	@Test
	public final void test51sConvertedIntoLI() {
		Assert.assertEquals("LI", RomanNumeral.convert(51));
	}

	@Test
	public final void test100sConvertedIntoC() {
		Assert.assertEquals("C", RomanNumeral.convert(100));
	}

	@Test
	public final void test90sConvertedIntoXC() {
		Assert.assertEquals("XC", RomanNumeral.convert(90));
	}

	@Test
	public final void test200sConvertedIntoCC() {
		Assert.assertEquals("CC", RomanNumeral.convert(200));
	}

	@Test
	public final void test300sConvertedIntoCCC() {
		Assert.assertEquals("CCC", RomanNumeral.convert(300));
	}
}
