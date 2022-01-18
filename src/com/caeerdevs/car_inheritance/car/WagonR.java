package com.caeerdevs.car_inheritance.car;

public class WagonR extends Car {

    private String mileage;


    public WagonR(String mileage){
        super(false,"4");
        this.mileage=mileage;
    }

    public String getMileage(){
        return this.mileage;
    }

    public String toString(){
        return "Sedan: "+getIsSedan()+"  Seats: "+getSeats()+" Mileage: "+mileage;
    }
}
