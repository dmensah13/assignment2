package org.howard.edu.lsp.exam.question40;

public class Animals {
	public interface Animal {
		public void move();
		public void speak();
	}
	
	public class Tiger implements Animal {
		@Override
		public void move() {
			System.out.println("This Tiger moves forward");
		}
		
		@Override
		public void speak() {
			System.out.println("This Tiger speaks");
		}
	}
	
	public abstract class Flying {
		public abstract void fly();
	}
	
	public class Goose extends Flying implements Animal{
		
		@Override
		public void move() {
			System.out.println("This Goose moves forward");
		}
		
		@Override
		public void speak() {
			System.out.println("This Goose speaks");
		}
		
		@Override
		public void fly() {
			System.out.println("This Goose flies");
		}
	}
	
	public class Airplane extends Flying {
		
		@Override 
		public void fly() {
			System.out.println("This airplane flies");
		}
	}
	
	
}
