package nl.inekevermeulen.ejp;

import nl.inekevermeulen.ejp.objectmethods.Bike;
import nl.inekevermeulen.ejp.objectmethods.BikeType;

public class App {

    public static void main(String[] args) {
        Bike bike = new Bike.Builder("SL Road", "Cube", BikeType.GRAVEL)
                .occassion(false)
                .frameSizeCm(50)
                .wheelSizeInch(28)
                .price(543.22)
                .build();
        System.out.println("I want to ride my " + bike.getBrand() + " " + bike.getModel());
    }
}
