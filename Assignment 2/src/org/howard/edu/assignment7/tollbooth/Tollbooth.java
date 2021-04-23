package org.howard.edu.assignment7.tollbooth;

public class Tollbooth {
	/**
	 * The abstract class Truck contains all the attributes
	 * that a Truck object will have
	 */
	public abstract class Truck {
		public abstract int total_axles();
		public abstract int total_weight();
		public abstract String truck_make();
		
	}
	
	/**
	 * The interface Tollbooth contains the behaviors necessary
	 * for a tollbooth to function successfully
	 * 
	 */
	public static interface TollBooth {
		public void calculateToll(Truck truck);
		public void displayData();
		public void reset();
		
	}
	

	public class Ford extends Truck {
		
		int truck_axles = 0;
		int truck_weight = 0;
		String truck_make = "";
		
		/**
		 * @param truck_axles 	                  the number of axles on a truck
		 * @param truck_weight                    the total weight of the truck
		 * @param truck_make                      the make of the truck
		 */
		public Ford (int truck_axles, int truck_weight, String truck_make) {
			
			this.truck_axles = truck_axles;
			this.truck_weight = truck_weight;
			this.truck_make = truck_make;
		}
		
		@Override
		public int total_axles() {
			return truck_axles;
		}
		
		@Override
		public int total_weight() {
			return truck_weight;
		}


		@Override
		public String truck_make() {
			return truck_make;
			
		}
	}
	
	
	public class Toyota extends Truck {
		
		int truck_axles = 0;
		int truck_weight = 0;
		String truck_make = "";
		
		/**
		 * @param truck_axles 	                  the number of axles on a truck
		 * @param truck_weight                    the total weight of the truck
		 * @param truck_make                      the make of the truck
		 */
		public Toyota (int truck_axles, int truck_weight, String truck_make) {
			this.truck_axles = truck_axles;
			this.truck_weight = truck_weight;
			this.truck_make = truck_make;
		}
		
		@Override
		public int total_axles() {
			return truck_axles;
		}
		
		@Override
		public int total_weight() {
			return truck_weight;
		}


		@Override
		public String truck_make() {
			return truck_make;
			
		}
	}
	

	public static class ChicagoTollbooth implements TollBooth {
		
		int truck_count;
		int toll_collected;

		public ChicagoTollbooth(){
			truck_count = 0;
			toll_collected = 0;
		}
		
		@Override
		//Calculates the toll for a passing truck
		public void calculateToll(Truck truck) {
			int total_axles = truck.total_axles();
			int total_weight = truck.total_weight();
			String truck_make = truck.truck_make();
			int toll_amount = (total_axles * 5) + (total_weight/500);
			truck_count += 1;
			toll_collected += toll_amount;
			
			System.out.println("Number of Axles: " + total_axles);
			System.out.println("Total Weight: " + total_weight);
			System.out.println("Make: " + truck_make);
			System.out.println("Toll Amount: $" + toll_amount);
			
		}

		@Override
		//Displays information accumulated in booth
		public void displayData() {
			System.out.println("Current Trucks Passed: " + truck_count);
			System.out.println("Toll Collected: " + toll_collected);
			
		}
		@Override
		//Resets the toll's information
		public void reset() {
			truck_count = 0;
			toll_collected = 0;
					
		}
	}
}
