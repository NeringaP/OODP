package org.example.behavioral.handler;

public class HvacDesignHandler extends ProjectHandler {
    @Override
    public boolean design(Project project) {
        if(!project.getHasHvacDesign()) {
            System.out.println("Designing HVAC part");
            project.setHasHvacDesign(true);
            designNext(project);
            return false;
        }
        return designNext(project);
    }
}
