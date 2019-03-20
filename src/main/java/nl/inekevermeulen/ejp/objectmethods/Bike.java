package nl.inekevermeulen.ejp.objectmethods;

public class Bike {
    private String model;
    private String brand;
    private BikeType type;
    private int wheelSizeInch;
    private int frameSizeCm;
    private double price;
    private boolean occassion;

    public static class Builder {
        //required
        private String model;
        private String brand;
        private BikeType type;

        //optional
        private int wheelSizeInch;
        private int frameSizeCm;
        private double price;
        private boolean occassion;

        public Builder(String model, String brand, BikeType type) {
            this.model = model;
            this.brand = brand;
            this.type = type;
        }

        public Builder wheelSizeInch(int wheelSizeInch) {
            this.wheelSizeInch = wheelSizeInch;
            return this;
        }

        public Builder frameSizeCm(int frameSizeCm) {
            this.frameSizeCm = frameSizeCm;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder occassion(boolean occassion) {
            this.occassion = occassion;
            return this;
        }

        public Bike build() {
            return new Bike(this);
        }
    }

    private Bike(Builder builder) {
        model = builder.model;
        brand = builder.brand;
        type = builder.type;
        wheelSizeInch = builder.wheelSizeInch;
        frameSizeCm = builder.frameSizeCm;
        price = builder.price;
        occassion = builder.occassion;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public BikeType getType() {
        return type;
    }

    public int getWheelSizeInch() {
        return wheelSizeInch;
    }

    public int getFrameSizeCm() {
        return frameSizeCm;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccassion() {
        return occassion;
    }

    
}
