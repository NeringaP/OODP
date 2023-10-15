package org.example.structural.composite;

import org.example.creational.builder.Engineer;
import org.example.creational.builder.House;

public class Main {
    public static void main(String[] args) {

       ProjectCostService projectCostService = new ProjectCostService();

        House noraHouse = House.newBuilder()
                .withName("Nora")
                .withPrice(370_000)
                .build();

        House tuvaHouse = House.newBuilder()
                .withName("Tuva")
                .withPrice(410_000)
                .build();

        Engineer engineer = Engineer.newBuild()
                .withFirstname("Laura")
                .withContractCost(7000)
                .build();

        projectCostService.combineProjectComponents(
                new CompositeProject(
                        noraHouse,
                        engineer
                ),
                new CompositeProject(
                        tuvaHouse,
                        engineer
                )
        );

        System.out.println(projectCostService.calculateTotalCost());

    }
}
