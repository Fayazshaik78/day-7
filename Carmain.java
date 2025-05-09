package com.elc.blc;

public class Carmain {
	public static void main(String[] args) {
		Car car = new Car();
		car.setCarDetails("swift","maruti" , 600000);
		System.out.println(car.getCarDetails());
	}

}
