package org.example.cars;

public abstract class Car {
    protected String vinNumber;
    protected String make;
    protected String model;
    protected int mileage;

    public Car(String vinNumber, String make, String model, int mileage){
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    public String getInfo (){
        return "VIN: " + vinNumber + ", Marca: " + make + ", Model: " + model + ", Kilometraje: " + mileage;
    }
}
