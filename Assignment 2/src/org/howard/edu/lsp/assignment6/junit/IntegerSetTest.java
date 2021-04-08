package org.howard.edu.lsp.assignment6.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {
	
	@Test
	@DisplayName("Tests cases for .add(int value)")
	public void testAdd() {
		IntegerSet intSet1 = new IntegerSet();
		IntegerSet intSet2 = new IntegerSet();
		
		intSet1.add(0);
		
		intSet2.add(3);
		intSet2.add(7);
		intSet2.add(6);
		intSet2.add(87);
		intSet2.add(14);
		
		int outputA = intSet1.length();
		int outputB = intSet2.length();
		assertEquals(1,outputA);
		assertEquals(5,outputB);
	}
	
	@Test
	@DisplayName("Tests cases for .remove(int value)")
	public void testRemove() {
		IntegerSet intSet1 = new IntegerSet();
		IntegerSet intSet2 = new IntegerSet();
		
		intSet1.add(0);
		
		intSet2.add(3);
		intSet2.add(7);
		intSet2.add(6);
		intSet2.add(87);
		intSet2.add(14);
		
		intSet1.remove(0);
		
		intSet2.remove(6);
		intSet2.remove(14);
		
		int outputC = intSet1.length();
		int outputD = intSet2.length();
		assertEquals(0,outputC);
		assertEquals(3,outputD);
	}
	
	@Test
	@DisplayName("Tests cases for .length() method")
	public void testLength() {
		IntegerSet intSet1 = new IntegerSet();
		IntegerSet intSet2 = new IntegerSet();
		
		intSet2.add(3);
		intSet2.add(7);
		intSet2.add(6);
		intSet2.add(87);
		intSet2.add(14);
		
		int output1 = intSet1.length();
		int output2 = intSet2.length();
		assertEquals(0,output1);
		assertEquals(5,output2);
	}
	
	@Test
	@DisplayName("Tests cases for .equals(IntegerSet b) method")
	public void testEquals() {
		IntegerSet intSet1 = new IntegerSet();
		IntegerSet intSet2 = new IntegerSet();
		IntegerSet intSet3 = new IntegerSet();
		
		intSet2.add(3);
		intSet2.add(7);
		intSet2.add(6);
		intSet2.add(87);
		intSet2.add(14);
		
		intSet3.add(3);
		intSet3.add(7);
		intSet3.add(6);
		intSet3.add(87);
		intSet3.add(14);
		
		boolean output3 = intSet1.equals(intSet2);
		boolean output4 = intSet2.equals(intSet3);
		assertFalse(output3);
		assertTrue(output4);
	}
	
	@Test
	@DisplayName("Tests cases for .contains(int value) method")
	public void testContains() {
		IntegerSet intSet1 = new IntegerSet();
		IntegerSet intSet2 = new IntegerSet();
		
		intSet2.add(3);
		intSet2.add(7);
		intSet2.add(6);
		intSet2.add(87);
		intSet2.add(14);
		
		boolean output5 = intSet2.contains(1);
		boolean output6 = intSet2.contains(87);
		boolean output7 = intSet1.contains(0);
		assertFalse(output5);
		assertTrue(output6);
		assertFalse(output7);
	}
	
	@Test
	@DisplayName("Tests cases for .largest() method")
	public void testLargest() throws IntegerSetException {
		IntegerSet intSet3 = new IntegerSet();
		IntegerSet intSet4 = new IntegerSet();
		IntegerSet intSet5 = new IntegerSet();
		
		intSet3.add(3);
		intSet3.add(7);
		intSet3.add(6);
		intSet3.add(87);
		intSet3.add(14);
		
		intSet4.add(-9);
		intSet4.add(23);
		intSet4.add(76);
		intSet4.add(55);
		intSet4.add(-48);
		
		intSet5.add(13);
		intSet5.add(62);
		intSet5.add(-27);
		intSet5.add(9);
		intSet5.add(44);
		
		int output8 = intSet3.largest();
		int output9 = intSet4.largest();
		int output10 = intSet5.largest();
		assertEquals(87, output8);
		assertEquals(76, output9);
		assertEquals(62, output10);
	}
	
	@Test
	@DisplayName("Tests cases for .smallest() method")
	public void testSmallest() throws IntegerSetException {
		IntegerSet intSet3 = new IntegerSet();
		IntegerSet intSet4 = new IntegerSet();
		IntegerSet intSet5 = new IntegerSet();
		
		intSet3.add(3);
		intSet3.add(7);
		intSet3.add(6);
		intSet3.add(87);
		intSet3.add(14);
		
		intSet4.add(-9);
		intSet4.add(23);
		intSet4.add(76);
		intSet4.add(55);
		intSet4.add(-48);
		
		intSet5.add(13);
		intSet5.add(62);
		intSet5.add(-27);
		intSet5.add(9);
		intSet5.add(44);
		
		int output11 = intSet3.smallest();
		int output12 = intSet4.smallest();
		int output13 = intSet5.smallest();
		assertEquals(3, output11);
		assertEquals(-48, output12);
		assertEquals(-27, output13);
	}
	
	@Test
	@DisplayName("Tests cases for .isEmpty() method")
	public void testEmpty() {
		IntegerSet intSet1 = new IntegerSet();
		IntegerSet intSet2 = new IntegerSet();
		
		intSet2.add(3);
		intSet2.add(7);
		intSet2.add(6);
		intSet2.add(87);
		intSet2.add(14);
		
		boolean output14 = intSet1.isEmpty();
		boolean output15 = intSet2.isEmpty();
		assertTrue(output14);
		assertFalse(output15);
	}
	
	@Test
	@DisplayName("Tests cases for .toString() method")
	public void testString() {
		IntegerSet intSet3 = new IntegerSet();
		IntegerSet intSet4 = new IntegerSet();
		IntegerSet intSet5 = new IntegerSet();
		
		intSet3.add(3);
		intSet3.add(7);
		intSet3.add(6);
		intSet3.add(87);
		intSet3.add(14);
		
		intSet4.add(-9);
		intSet4.add(23);
		intSet4.add(76);
		intSet4.add(55);
		intSet4.add(-48);
		
		intSet5.add(13);
		intSet5.add(62);
		intSet5.add(-27);
		intSet5.add(9);
		intSet5.add(44);
		
		String output16 = intSet3.toString();
		String output17 = intSet4.toString();
		String output18 = intSet5.toString();
		assertEquals("[3, 7, 6, 87, 14]", output16);
		assertEquals("[-9, 23, 76, 55, -48]", output17);
		assertEquals("[13, 62, -27, 9, 44]", output18);
	}
	
	@Test
	@DisplayName("Tests cases for .union(IntegerSet intSetb) method")
	public void testUnion(){
		IntegerSet intSet2 = new IntegerSet();
		IntegerSet intSet3 = new IntegerSet();
		IntegerSet intSet4 = new IntegerSet();
		IntegerSet intSet6 = new IntegerSet();
		IntegerSet intSet7 = new IntegerSet();
		IntegerSet intSet8 = new IntegerSet();
		
		intSet2.add(3);
		intSet2.add(7);
		intSet2.add(6);
		intSet2.add(87);
		intSet2.add(14);
		
		intSet3.add(3);
		intSet3.add(7);
		intSet3.add(6);
		intSet3.add(87);
		intSet3.add(14);
		
		intSet4.add(-9);
		intSet4.add(23);
		intSet4.add(76);
		intSet4.add(55);
		intSet4.add(-48);
		
		intSet6.add(13);
		intSet6.add(62);
		intSet6.add(-27);
		intSet6.add(9);
		intSet6.add(44);
		
		intSet7.add(92);
		intSet7.add(5);
		intSet7.add(-36);
		intSet7.add(0);
		intSet7.add(77);
		
		intSet6.union(intSet3);;
		intSet7.union(intSet4);
		intSet8.union(intSet2);
		String output19 = intSet6.toString();
		String output20 = intSet7.toString();
		String output21 = intSet8.toString();
		assertEquals("[13, 62, -27, 9, 44, 3, 7, 6, 87, 14]", output19);
		assertEquals("[92, 5, -36, 0, 77, -9, 23, 76, 55, -48]", output20);
		assertEquals("[3, 7, 6, 87, 14]", output21);
	}
	
	@Test
	@DisplayName("Tests .intersect(IntegerSet intSetb) method")
	public void testIntersect() {
		IntegerSet intSet2 = new IntegerSet();
		IntegerSet intSet4 = new IntegerSet();
		IntegerSet intSet5 = new IntegerSet();
		IntegerSet intSet9 = new IntegerSet();
		IntegerSet intSet10 = new IntegerSet();
		IntegerSet intSet11 = new IntegerSet();
		
		intSet2.add(3);
		intSet2.add(7);
		intSet2.add(6);
		intSet2.add(87);
		intSet2.add(14);
		
		intSet4.add(-9);
		intSet4.add(23);
		intSet4.add(76);
		intSet4.add(55);
		intSet4.add(-48);
		
		intSet5.add(13);
		intSet5.add(62);
		intSet5.add(-27);
		intSet5.add(9);
		intSet5.add(44);
		
		intSet9.add(90);
		intSet9.add(7);
		intSet9.add(34);
		intSet9.add(87);
		intSet9.add(14);
		
		intSet10.add(2);
		intSet10.add(-10);
		intSet10.add(-48);
		intSet10.add(55);
		intSet10.add(1);
		
		intSet11.add(-5);
		intSet11.add(81);
		intSet11.add(22);
		intSet11.add(69);
		intSet11.add(18);
		
		intSet9.intersect(intSet2);
		intSet10.intersect(intSet4);
		intSet11.intersect(intSet5);
		String output22 = intSet9.toString();
		String output23 = intSet10.toString();
		String output24 = intSet11.toString();
		assertEquals("[7, 87, 14]", output22);
		assertEquals("[-48, 55]", output23);
		assertEquals("[]", output24);
	}
	
	@Test 
	@DisplayName("Tests cases for .diff(IntegerSet intSetb) method")
	public void testDiff() {
		IntegerSet intSet2 = new IntegerSet();
		IntegerSet intSet4 = new IntegerSet();
		IntegerSet intSet5 = new IntegerSet();
		IntegerSet intSet12 = new IntegerSet();
		IntegerSet intSet13 = new IntegerSet();
		IntegerSet intSet14 = new IntegerSet();
		
		intSet2.add(3);
		intSet2.add(7);
		intSet2.add(6);
		intSet2.add(87);
		intSet2.add(14);
		
		intSet4.add(-9);
		intSet4.add(23);
		intSet4.add(76);
		intSet4.add(55);
		intSet4.add(-48);
		
		intSet5.add(13);
		intSet5.add(62);
		intSet5.add(-27);
		intSet5.add(9);
		intSet5.add(44);
		
		intSet12.add(90);
		intSet12.add(7);
		intSet12.add(34);
		intSet12.add(87);
		intSet12.add(14);
		
		intSet13.add(2);
		intSet13.add(-10);
		intSet13.add(-48);
		intSet13.add(55);
		intSet13.add(1);
		
		intSet14.add(-5);
		intSet14.add(81);
		intSet14.add(22);
		intSet14.add(69);
		intSet14.add(18);
		
		intSet12.diff(intSet2);
		intSet13.diff(intSet4);
		intSet14.diff(intSet5);
		String output25 = intSet12.toString();
		String output26 = intSet13.toString();
		String output27 = intSet14.toString();
		assertEquals("[90, 34]", output25);
		assertEquals("[2, -10, 1]", output26);
		assertEquals("[-5, 81, 22, 69, 18]", output27);
	}
	
	@Test
	@DisplayName("Tests cases for .clear()")
	public void testClear() {
		IntegerSet intSet2 = new IntegerSet();
		IntegerSet intSet4 = new IntegerSet();
		IntegerSet intSet5 = new IntegerSet();
		
		intSet2.add(3);
		intSet2.add(7);
		intSet2.add(6);
		intSet2.add(87);
		intSet2.add(14);
		
		intSet4.add(-9);
		intSet4.add(23);
		intSet4.add(76);
		intSet4.add(55);
		intSet4.add(-48);
		
		intSet5.add(13);
		intSet5.add(62);
		intSet5.add(-27);
		intSet5.add(9);
		intSet5.add(44);
		
		intSet2.clear();
		intSet4.clear();
		intSet5.clear();
		
		
		int output28 = intSet2.length();
		int output29 = intSet4.length();
		int output30 = intSet5.length();
		assertEquals(0,output28);
		assertEquals(0,output29);
		assertEquals(0,output30);
	}
}
