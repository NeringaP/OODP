package org.example.creational.builder;

import org.example.structural.composite.ProjectComponent;

public class House extends ProjectComponent {

    private String name;
    private double livingArea;
    private double garageArea;
    private int numberOfFloors;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private boolean hasFireplace;
    private int price;

    private House(Builder builder) {
        this.name = builder.name;
        this.livingArea = builder.livingArea;
        this.garageArea = builder.garageArea;
        this.numberOfFloors = builder.numberOfFloors;
        this.numberOfBedrooms = builder.numberOfBedrooms;
        this.numberOfBathrooms = builder.numberOfBathrooms;
        this.hasFireplace = builder.hasFireplace;
        this.price = builder.price;
    }

    public String getName() {
        return name;
    }

    public double getLivingArea() {
        return livingArea;
    }

    public double getGarageArea() {
        return garageArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public boolean isHasFireplace() {
        return hasFireplace;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public double calculateCost() {
        return getPrice();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "HouseInfo{" +
                "name='" + name + '\'' +
                ", livingArea=" + livingArea +
                ", garageArea=" + garageArea +
                ", numberOfFloors=" + numberOfFloors +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", hasFireplace=" + hasFireplace +
                ", price=" + price +
                '}';
    }


    public static class Builder {
        private String name;
        private double livingArea;
        private double garageArea;
        private int numberOfFloors;
        private int numberOfBedrooms;
        private int numberOfBathrooms;
        private boolean hasFireplace;
        private int price;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withLivingArea(double livingArea) {
            this.livingArea = livingArea;
            return this;
        }

        public Builder withGarageArea(double garageArea) {
            this.garageArea = garageArea;
            return this;
        }

        public Builder withNumberOfFloors(int numberOfFloors) {
            this.numberOfFloors = numberOfFloors;
            return this;
        }

        public Builder withNumberOfBedrooms(int numberOfBedrooms) {
            this.numberOfBedrooms = numberOfBedrooms;
            return this;
        }

        public Builder withNumberOfBathrooms(int numberOfBathrooms) {
            this.numberOfBathrooms = numberOfBathrooms;
            return this;
        }

        public Builder withHasFireplace(boolean hasFireplace) {
            this.hasFireplace = hasFireplace;
            return this;
        }

        public Builder withPrice(int price) {
            this.price = price;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
