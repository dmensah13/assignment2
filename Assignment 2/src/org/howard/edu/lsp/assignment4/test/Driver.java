package org.howard.edu.lsp.assignment4.test;
import org.howard.edu.lsp.assignment4.implementation.IntegerSet;
import org.howard.edu.lsp.assignment4.implementation.IntegerSetException;

/**
 * 
 * @author Darryle Mensah
 * This code test the various functions of the IntegerSet class
 * which contains useful functions for sets
 */
public class Driver {
	/**
	 * 
	 * @param args Arugument
	 * @throws IntegerSetException stops the code in certain circumstances
	 */
	public static void main(String[] args) throws IntegerSetException {
		// TODO Auto-generated method stub
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		IntegerSet set5 = new IntegerSet();
		
		
		set1.add(3);
		set1.add(7);
		set1.add(6);
		set1.add(87);
		set1.add(14);
	
		//The Default of Set1
		System.out.println("The following set contains the values: " + set1.toString());
		System.out.println();
		
		//The value 11 is added to Set1
		System.out.println("This is the set before 11 is added: " + set1.toString());
		set1.add(11);
		System.out.println("This is the set after 11 is added: " + set1.toString());
		System.out.println();
		
		//The value 3 is attempted to be added to Set1 but fails
		System.out.println("This is the set before 3 is added: " + set1.toString());
		set1.add(3);
		System.out.println("This is the set after 3 is added: " + set1.toString());
		System.out.println("Nothing happened because 3 is already in the set.");
		System.out.println();
		
		//The value 6 is removed from Set1
		System.out.println("This is the set before 6 is removed: " + set1.toString());
		set1.remove(6);
		System.out.println("This is the set after 6 is removed: " + set1.toString());
		System.out.println();
		
		//The value 77 is attempted to be removed from Set1 but fails
		System.out.println("This is the set before 77 is removed: " + set1.toString());
		set1.remove(77);
		System.out.println("This is the set after 77 is added: " + set1.toString());
		System.out.println("Nothing happened because 3 is already in the set.");
		System.out.println();
		
		//The length of Set1 is printed
		System.out.println("The length of this set is: " + set1.length());
		System.out.println();
		
		//The largest value of Set1 is printed
		System.out.println("The following set contains the values: " + set1.toString());
		System.out.println("The largest value in this set is: " + set1.largest());
		System.out.println();
		
		//The smallest value of Set1 is printed
		System.out.println("The following set contains the values: " + set1.toString());
		System.out.println("The smallest value in this set is: " + set1.smallest());
		System.out.println();
		
		//Checks to see if the value 7 is in Set1
		System.out.println("The following set contains the values: " + set1.toString());
		System.out.println("Does this set contain the value 7: " + set1.contains(7));
		System.out.println();
		
		//Checks to see if the value 36 is in Set1
		System.out.println("The following set contains the values: " + set1.toString());
		System.out.println("Does this set contain the value 36: " + set1.contains(36));
		System.out.println();
		
		set2.add(87);
		set2.add(7);
		set2.add(11);
		set2.add(3);
		//Checks to see if Set1 contains all the values in Set2
		set2.add(14);
		System.out.println("Set 1 contains the values: " + set1.toString());
		System.out.println("Set 2 contains the values: " + set2.toString());
		System.out.println("Does Set 1 contain the same values as Set 2: " + set1.equals(set2));
		System.out.println();
		
		
		set3.add(56);
		set3.add(0);
		set3.add(11);
		set3.add(4);
		set3.add(87);
		//Checks to see if Set1 contains all the values in Set3
		System.out.println("Set 1 contains the values: " + set1.toString());
		System.out.println("Set 3 contains the values: " + set3.toString());
		System.out.println("Does Set 1 contain the same values as Set 3: " + set1.equals(set3));
		System.out.println();
		
		//Prints the intersection between Set2 and Set3
		System.out.println("Set 2 contains the values: " + set2.toString());
		System.out.println("Set 3 contains the values: " + set3.toString());
		set2.intersect(set3);
		System.out.println("The intersection between Set2 and Set3 is the following: " + set2.toString());
		System.out.println();
		
		//Prints the union between Set1 and Set3
		System.out.println("Set 1 contains the values: " + set1.toString());
		System.out.println("Set 3 contains the values: " + set3.toString());
		set1.union(set3);
		System.out.println("The intersection between Set1 and Set3 is the following: " + set1.toString());
		System.out.println();
		
		//Prints the difference between Set1 and Set2
		System.out.println("Set 1 contains the values: " + set1.toString());
		System.out.println("Set 2 contains the values: " + set2.toString());
		set1.diff(set2);
		System.out.println("The difference between Set1 and Set2 is the following: " + set1.toString());
		System.out.println();
		
		//The values of Set1 are removed
		System.out.println("This is the Set 1 before it's emptied: " + set1.toString());
		set1.clear();
		System.out.println("This is the Set 1 after it's emptied: " + set1.toString());
		System.out.println();
		
		//Checks to see if Set1 is empty
		System.out.println("The following set contains the values: " + set1.toString());
		System.out.println("Is Set 1 empty?: " + set1.isEmpty());
		System.out.println();
		
		//Checks to see if Set2 is empty
		System.out.println("The following set contains the values: " + set2.toString());
		System.out.println("Is Set 2 empty?: " + set2.isEmpty());
		System.out.println();
				
		
	}

}
