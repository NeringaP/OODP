package org.example.behavioral.handler;

public class ExteriorDesignHandler extends ProjectHandler {
    @Override
    public boolean design(Project project) {
        if(!project.getHasExteriorDesign()) {
            System.out.println("Designing exterior part");
            project.setHasExteriorDesign(true);
            designNext(project);
            return false;
        }
        return designNext(project);
    }
}
