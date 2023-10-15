package org.example.creational.singleton;

public class SeniorEngineer {
    private static volatile SeniorEngineer seniorEngineer;

    private SeniorEngineer() {
    }

    public static SeniorEngineer getSeniorEngineer() {
        SeniorEngineer result = seniorEngineer;
        if(result == null) {
            synchronized (SeniorEngineer.class) {
                result = seniorEngineer;
                if (result == null) {
                    seniorEngineer = result = new SeniorEngineer();
                }
            }
        }
        return result;
    }
}
