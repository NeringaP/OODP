package org.example.behavioral.handler;

public class ElectricalDesignHandler extends ProjectHandler {
    @Override
    public boolean design(Project project) {
        if(!project.getHasElectricalDesign()) {
            System.out.println("Designing electrical part");
            project.setHasElectricalDesign(true);
            designNext(project);
            return false;
        }
        return designNext(project);
    }
}
