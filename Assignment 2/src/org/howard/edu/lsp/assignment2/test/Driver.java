package org.howard.edu.lsp.assignment2.test;
import org.howard.edu.lsp.assignment2.combination.Combination;
import java.util.Arrays;

public class Driver {
	/**
	 * Tests 'findSums' with different inputs
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Combination test = new Combination();
		
		//Empty Array
		int [] test_input0 = {};
		int target_sum = 6;
		System.out.println("Input: " + Arrays.toString(test_input0));
		System.out.println("Target Sum: " + target_sum);
		System.out.println("Output: " + test.findSums(test_input0, target_sum) + "\n");
		
		//Example 1 (Sorted)
		int [] test_input1 = {1,2,3,4,5,6};
		target_sum = 6;
		System.out.println("Input: " + Arrays.toString(test_input1));
		System.out.println("Target Sum: " + target_sum);
		System.out.println("Output: " + test.findSums(test_input1, target_sum) + "\n");
		
		//Example 1 (Unsorted)
		int [] test_input2 = {2,4,6,1,5,3};
		target_sum = 6;
		System.out.println("Input: " + Arrays.toString(test_input2));
		System.out.println("Target Sum: " + target_sum);
		System.out.println("Output: " + test.findSums(test_input2, target_sum) + "\n");
		
		//Example 2 (Sorted)
		int [] test_input3 = {1,2,3,4,5,6,10};
		target_sum = 10;
		System.out.println("Input: " + Arrays.toString(test_input3));
		System.out.println("Target Sum: " + target_sum);
		System.out.println("Output: " + test.findSums(test_input3, target_sum) + "\n");
		
		//Example 2 (Unsorted)
		int [] test_input4 = {5,2,6,3,10,1,4};
		target_sum = 10;
		System.out.println("Input: " + Arrays.toString(test_input4));
		System.out.println("Target Sum: " + target_sum);
		System.out.println("Output: " + test.findSums(test_input4, target_sum) + "\n");
		
		//Example 3 (Duplicated Entries)
		int [] test_input5 = {8,8,24,16};
		target_sum = 24;
		System.out.println("Input: " + Arrays.toString(test_input5));
		System.out.println("Target Sum: " + target_sum);
		System.out.println("Output: " + test.findSums(test_input5, target_sum) + "\n");
		
		//Example 4 (Only Negative Entries)
		int [] test_input6 = {-8, -1};
		target_sum = -9;
		System.out.println("Input: " + Arrays.toString(test_input6));
		System.out.println("Target Sum: " + target_sum);
		System.out.println("Output: " + test.findSums(test_input6, target_sum) + "\n");
		
		//Example 5 (Negative and Positive Entries)
		int [] test_input7 = {5, -4, -9, 1};
		target_sum = -9;
		System.out.println("Input: " + Arrays.toString(test_input7));
		System.out.println("Target Sum: " + target_sum);
		System.out.println("Output: " + test.findSums(test_input7, target_sum) + "\n");
		

	}

}
