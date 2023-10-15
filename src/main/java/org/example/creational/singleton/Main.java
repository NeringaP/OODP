package org.example.creational.singleton;

public class Main {
    public static void main(String[] args) {
        final SeniorEngineer seniorEngineer1 = SeniorEngineer.getSeniorEngineer();
        final SeniorEngineer seniorEngineer2 = SeniorEngineer.getSeniorEngineer();

        System.out.println("Senior engineer 1: "+ seniorEngineer1);
        System.out.println("Senior engineer 2: "+ seniorEngineer2);

        if(seniorEngineer1 == seniorEngineer2) {
            System.out.println("Objects are equal");
        }
    }
}
