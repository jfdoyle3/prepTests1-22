package com.caeerdevs.car_inheritance.car;

public abstract class Car {

    private Boolean isSedan;
    private String seats;

    public  Car(Boolean isSedan, String seats){
        this.isSedan=isSedan;
        this.seats=seats;
    }

    public Boolean getIsSedan() {
        return this.isSedan;
    }

    public String getSeats(){
        return this.seats;
    }

    public abstract String getMileage();

    @Override
    public String toString() {
        return "Car{" +
                "isSedan=" + isSedan +
                ", seats='" + seats + '\'' +
                '}';
    }
}
