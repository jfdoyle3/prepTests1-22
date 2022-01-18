package com.caeerdevs.car_inheritance.car;

public class InnovaCrysta extends Car {

    private String mileage;

    public InnovaCrysta (String mileage){
        super(false, "6");
        this.mileage=mileage;
    }

    public String getMileage(){
        return this.mileage;
    }

    public String toString(){
        return "Sedan: "+getIsSedan()+"  Seats: "+getSeats()+" Mileage: "+mileage;
    }
}
