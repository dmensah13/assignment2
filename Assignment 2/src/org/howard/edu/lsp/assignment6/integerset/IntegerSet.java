package org.howard.edu.lsp.assignment6.integerset;
import java.util.*;
import java.util.ArrayList;

public class IntegerSet {
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> set = new ArrayList<Integer>();

		// Clears the internal representation of the set
	/**
	 * Removes all values within set
	 */
	public void clear() {
    set.removeAll(set);
	};

	/**
	 * 
	 * @return the length of set
	 */
	public int length() {
		return set.size();
	}; 

	/**
	 * 
	 * @param b an IntegerSet object that will be compared to set
	 * @return True if the sets contain the same value in any order and False otherwise
	 */
	public boolean equals(IntegerSet b) {
		if(set.containsAll(b.getIntegerSet(set)) == true){
      return true;
    }
    return false;
	}; 
	

	/**
	 * 
	 * @param value an integer value 
	 * @return True if the parameter 'value' is in set and False otherwise
	 */
	public boolean contains(int value) {
		for (int i = 0; i < set.size(); i++){
      if(set.get(i) == value){
        return true;
      }
    }
    return false;
	};    

	
	/**
	 * 
	 * @return the largest item in the set
	 * @throws IntegerSetException an exception if set is empty
	 */
	public int largest() throws IntegerSetException {
		if(set.size() == 0){
			 throw new IntegerSetException("There are no values in this set!");
		}
		return Collections.max(set);
	}; 

	/**
	 * 
	 * @return the smallest item in the set
	 * @throws IntegerSetException an exception if set is empty
	 */
	public int smallest() throws IntegerSetException{
		if(set.size() == 0){
			 throw new IntegerSetException("There are no values in this set!");
		}
		return Collections.min(set);

	};
	
	/**
	 * 
	 * @param item an integer value that is to be added into set
	 * Adds an item to the set or does nothing it already there	
	 */
	public void add(int item) {
		if(set.contains(item)== false){
			set.add(item);
		}
		
	}; 

	/**
	 * 
	 * @param item an integer value that is to be removed from set
	 * Removes an item from the set or does nothing if not there
	 */
	public void remove(int item) {
		if(set.contains(item)== true){
			set.remove(Integer.valueOf(item));
		}
	}; 

	/**
	 * 
	 * @param intSetb an IntegerSet object that will be unified with set
	 */
	public void union(IntegerSet intSetb) {
		set.addAll(intSetb.getIntegerSet(set));
	};

	/**
	 * 
	 * @param intSetb an IntegerSet object that will be intersected with set
	 */
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.getIntegerSet(set));
	}; 

	/**
	 * 
	 * @param intSetb an IntegerSet object that will have its values removed from set
	 */
	public void diff(IntegerSet intSetb) {
		set.removeAll(intSetb.getIntegerSet(set));
	}; 

	/**
	 * 
	 * @return True if the set is empty and False otherwise
	 */
	public boolean isEmpty() {
		if(set.size() == 0) {
			return true;
		}
		return false;
	}; 

	/**
	 * @return The string representation of set
	 */
	public String toString() {
		return set.toString();
	}
	
	/**
	 * 
	 * @param set an IntegerSet object
	 * @return The reference to set
	 */
	public List<Integer> getIntegerSet(List<Integer> set){
		return this.set;
	}


}