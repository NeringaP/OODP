package org.example.creational.builder;

public class Main {
    public static void main(String[] args) {
        House noraHouse = House.newBuilder()
                .withName("Nora")
                .withLivingArea(122.4)
                .withNumberOfFloors(2)
                .withNumberOfBathrooms(2)
                .withNumberOfBedrooms(2)
                .withHasFireplace(true)
                .withPrice(370_000)
                .build();

        System.out.println(noraHouse);

    }
}
