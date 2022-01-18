package com.caeerdevs.car_inheritance.car;

public class HondaCity extends Car {


    private String mileage;

    public HondaCity(String mileage){
        super(true, "4");
        this.mileage=mileage;
    }

    @Override
    public String getMileage() {
        return this.mileage;
    }

    public String toString(){
        return "Sedan: "+getIsSedan()+"  Seats: "+getSeats()+" Mileage: "+mileage;
    }
}
