package org.howard.edu.lsp.assignment2.combination;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * This program takes in a list of numbers and a target sum as parameters.
 * The program finds all possible combinations of numbers who total to get
 * the target sum and returns a list of lists.
 * 
 * @Author Darryle Mensah
 * @Date February 11, 2021
 * 
 */

public class Combination {
	
	   /**
	   * 
	   * @param input          an array of integers
	   * 
	   * @param target_sum     the desired sum for integers in 'input'
	   *                       to total to
	   *                       
	   * @return               a 2D Array List containing all possible combinations
	   *                       of integers in 'input' that equal 'target_sum'
	   */
	
	  public ArrayList<ArrayList<Integer>> findSums(int[] input, int target_sum) {		
			
		/**
		 * 
		 * 
		 */
		ArrayList<Integer> sliding_array = new ArrayList<>();   //Temporarily holds integers while adding towards 'target_sum'
		ArrayList<ArrayList<Integer>> sums_array = new ArrayList<>();  //Holds the integer values of all combinations in 'input'
	    ArrayList<ArrayList<Integer>> index_array = new ArrayList<>();  //Holds the index values of all combinations in 'input'
	    ArrayList<Integer> duplicated_input = new ArrayList<>();   //Acts as an identical copy of 'input'
	    int[] sorted_input = input.clone();  //Holds all integers in 'input' but is sorted
	    
	    int current_sum;  //Holds the sum of integers within 'sliding_array'
	    int diff;   //Holds the difference between 'target_sum' and 'current_sum' 
	    int temp_sum;  //Holds the sum of 'current_sum' and an integer of 'input'
	    int temp_diff; //Holds the difference of 'temp_sum' and 'target_sum'
	    
	    //Returns Null if 'input' is empty
	    if(input == null) {
	    	return null;
	    }
	     
	    Arrays.sort(sorted_input);
	    //Loops through 'sorted_input' to find 'target_sum' and add it to 'sums_array'
	    for (int a = 0; a < sorted_input.length; a++){  
	      if (input[a] == target_sum){
	        sliding_array.add(input[a]);
	        sums_array.add(sliding_array);
	        sliding_array = new ArrayList<>();
	      }
	    }
	    
	    //(Outer Loop) Provides the starting point for adding integers to 'sliding_array' from the end of 'sorted_input'
	    for (int i = sorted_input.length-1; i >= 0; i--){
	      //Makes 'i' the first value in 'sliding_array' and adds it to 'current_sum'
	      current_sum = sorted_input[i];
	      sliding_array.add(sorted_input[i]);
	      
	      //(Inner Loop) Loops over the integers in 'sorted_input' 'i' amount of times
	      for (int j = i-1; j >= 0; j--) {
	    	  diff = target_sum - current_sum;
	          //Adds an integer to 'sliding_array' and its value to 'current_sum'
	    	  if (sorted_input[j] <= diff && sorted_input[j] != target_sum){
	        	sliding_array.add(sorted_input[j]);
	        	current_sum += sorted_input[j];
	        	//Adds sliding_array to 'sums_array' if 'current_sum' equals 'target_sum'
	        	if(current_sum == target_sum){
	        		sums_array.add(sliding_array);
	          }
	        }
	        
	        //Assigns values to 'temp_sum' and 'temp_difference'
	    	  else if(sorted_input[j] != target_sum){
	        	temp_sum = current_sum + sorted_input[j];
	        	temp_diff = temp_sum - target_sum;
	        	
	        	//Checks if 'temp_diff' is an integer in 'sliding_array' that can be removed in place of 'sorted_input[j]'
	            if(sliding_array.contains(temp_diff)){
			        sliding_array.remove(Integer.valueOf(temp_diff));
		            sliding_array.add(sorted_input[j]);
		            current_sum += sorted_input[j];
		            sums_array.add(sliding_array);
	            }
	          }
	      }
	      //Resets 'sliding_array'
	      sliding_array = new ArrayList<>();
		}

	    //Assigns the values of 'input' to 'duplicated_input'
	    for (int b = 0; b < input.length; b++) {
	    	duplicated_input.add(input[b]);
	    }

	    //Assigns the indices of the values in sums_array to 'index_array'
	    for (int x = 0; x < sums_array.size(); x++) {
	      ArrayList<Integer> row = new ArrayList<>();
	      
	      //Takes the index in 'duplicated_array' of the value and puts it in 'index_array'
	      for (int y = 0; y < sums_array.get(x).size(); y++) {
	        row.add(duplicated_input.indexOf(sums_array.get(x).get(y)));
	      }
	      index_array.add(row);
	    }
	    //Return 'index_array'
	    return index_array;
				
		}
}
