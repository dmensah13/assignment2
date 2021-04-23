package org.howard.edu.assignment7.junit;

import org.howard.edu.assignment7.tollbooth.Tollbooth.ChicagoTollbooth;
import org.howard.edu.assignment7.tollbooth.Tollbooth.Ford;
import org.howard.edu.assignment7.tollbooth.Tollbooth.TollBooth;
import org.howard.edu.assignment7.tollbooth.Tollbooth.Toyota;
import org.howard.edu.assignment7.tollbooth.Tollbooth.Truck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ToolboothTest {

	@Test
	@DisplayName("Tests Ford Trucks in TestBooth")
	public static void main(String[] args) {
		TollBooth testBooth = new ChicagoTollbooth();
		Truck testFord1 = new Ford(5, 12000, "Ford V2");
		Truck testFord2 = new Ford(4, 10000, "Ford V3");
		Truck testFord3 = new Ford(7, 15000, "Ford V4");
		
		System.out.println("First truck approaches booth...");
		testBooth.calculateToll(testFord1);
		testBooth.displayData();
		System.out.println();
		System.out.println("Second truck approaches booth...");
		testBooth.calculateToll(testFord2);
		testBooth.displayData();
		System.out.println();
		System.out.println("Third truck approaches booth...");
		testBooth.calculateToll(testFord3);
		testBooth.displayData();
		System.out.println();
		
	}
	
	@Test
	@DisplayName("Tests Toyota Trucks in TestBooth")
	public void testToyota() {
		TollBooth testBooth = new ChicagoTollbooth();
		Truck testToyota1 = new Toyota(6, 18000, "Toyota V3");
		Truck testToyota2 = new Toyota(2, 10000, "Toyota V4");
		Truck testToyota3 = new Toyota(8, 20000, "Toyota V5");
		
		System.out.println("First truck approaches booth...");
		testBooth.calculateToll(testToyota1);
		testBooth.displayData();
		System.out.println();
		System.out.println("Second truck approaches booth...");
		testBooth.calculateToll(testToyota2);
		testBooth.displayData();
		System.out.println();
		System.out.println("Third truck approaches booth...");
		testBooth.calculateToll(testToyota3);
		testBooth.displayData();
		System.out.println();
		
	}

}

