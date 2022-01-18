package com.caeerdevs.car_inheritance;

import com.caeerdevs.car_inheritance.car.Car;
import com.caeerdevs.car_inheritance.car.HondaCity;
import com.caeerdevs.car_inheritance.car.InnovaCrysta;
import com.caeerdevs.car_inheritance.car.WagonR;

import java.util.Scanner;

public class CarInheritance {

    public static void carInheritance(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("0: WagonR\n1: HondaCity\n2: InnovaCrysta\nSelect Car: ");
        int input=scanner.nextInt();
        System.out.print("Input mileage: ");
        String mileage=scanner.next();
        switch (input){
            case 0: {
                Car wagonR= new WagonR(mileage);
                output("WagonR",wagonR.getIsSedan(),wagonR.getSeats(),mileage);
                break;
            }
            case 1: {
                Car hondaCity = new HondaCity(mileage);
                output("HondaCity",hondaCity.getIsSedan(),hondaCity.getSeats(),mileage);
                break;
            }
            case 2: {
                Car innovaCrysta=new InnovaCrysta(mileage);
                output("InnovaCrysta",innovaCrysta.getIsSedan(),innovaCrysta.getSeats(),mileage);
                break;
            }

        }

    }
    public static void output(String name, Boolean isSedan, String seats, String mileage){
        String word=(!isSedan)? "not" : "a";
        System.out.println("A "+name+" is "+word+" Sedan, is "+seats+"-seater, and has mileage of around "+mileage+" kmpl");
    }
}
