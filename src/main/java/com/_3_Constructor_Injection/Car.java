package com._3_Constructor_Injection;


public class Car {
	private String carName;
	private Engine engine;
	
	
	
    public Car(String carName, Engine engine) {
		super();
		this.carName = carName;
		this.engine = engine;
	}


    @Override
	public String toString() {
		return "Car [carName=" + carName + ", engine=" + this.engine.getType() + "]";
	}


	public void start() {
        System.out.println("Car is starting with " + engine.getType() + " engine");
    }
}
