package com.MultipleInheritance;

public class MultipleInheritance implements Bike,car {
	
	public void show()
	{
		Bike.show();
		car.show();
		
	}
	
	public static void main(String[] args) {
		MultipleInheritance muxIn= new MultipleInheritance();
		muxIn.show();
	}

}
