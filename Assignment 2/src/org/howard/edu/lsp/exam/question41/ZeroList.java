package org.howard.edu.lsp.exam.question41;
import java.util.*;
/**
 * 
 * @author Darryle Mensah
 * @Date April 22, 2021
 *
 */
public class ZeroList {
	/**
	 * 
	 * @param lst                an ArrayList of integers
	 * 
	 * 
	 * @return                   an ArrayList that contains no integers
	 *                           with the value of 0
	 */
	public ArrayList<Integer> removeZeroes(ArrayList<Integer> lst) {
		int i = 0;
		while( i < lst.size()) {
			if(lst.get(i) == 0) {
				lst.remove(i);
			}
			else {
				i += 1;
			}
		}
		return lst;
	}
}
