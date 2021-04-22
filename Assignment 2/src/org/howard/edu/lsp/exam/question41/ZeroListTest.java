package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
/**
 * 
 * @author darrylemensah
 *
 */

class ZeroListTest {
	/**
	 * 
	 */
	ZeroList test = new ZeroList();
	@Test
	@DisplayName("Base case for .removeZeroes(ArrayList<Integer> lst)")
	void initial_Test() {
		ArrayList<Integer> set1 = new ArrayList<Integer>();
		set1.add(0);
		set1.add(7);
		set1.add(0);
		set1.add(2);
		set1.add(0);
		set1.add(1);
		ArrayList<Integer> set2 = test.removeZeroes(set1);
		assertEquals("[7, 2, 1]", set2.toString());
	}
	
	@Test
	@DisplayName("Test case with all zeroes for .removeZeroes(ArrayList<Integer> lst)")
	void zero_Test() {
		ArrayList<Integer> set3 = new ArrayList<Integer>();
		set3.add(0);
		set3.add(0);
		set3.add(0);
		set3.add(0);
		set3.add(0);
		set3.add(0);
		ArrayList<Integer> set4 = test.removeZeroes(set3);
		assertEquals("[]", set4.toString());
	}
	
	@Test
	@DisplayName("Test case with an empty list for .removeZeroes(ArrayList<Integer> lst)")
	void empty_Test() {
		ArrayList<Integer> set5 = new ArrayList<Integer>();
		ArrayList<Integer> set6 = test.removeZeroes(set5);
		assertEquals("[]", set6.toString());
	}
	
	@Test
	@DisplayName("Test case with all nonzeroes for .removeZeroes(ArrayList<Integer> lst)")
	void nonzero_Test() {
		ArrayList<Integer> set7 = new ArrayList<Integer>();
		set7.add(8);
		set7.add(7);
		set7.add(3);
		set7.add(2);
		set7.add(4);
		set7.add(1);
		ArrayList<Integer> set8 = test.removeZeroes(set7);
		assertEquals("[8, 7, 3, 2, 4, 1]", set8.toString());	
	}

}
