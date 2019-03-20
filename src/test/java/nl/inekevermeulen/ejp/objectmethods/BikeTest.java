package nl.inekevermeulen.ejp.objectmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BikeTest {

    @Test
    void testBike() {
        Bike bike = new Bike.Builder("SL Road", "Cube", BikeType.GRAVEL)
                .occassion(false)
                .frameSizeCm(50)
                .wheelSizeInch(28)
                .price(543.22)
                .build();
        assertEquals("SL Road", bike.getModel());
    }
}