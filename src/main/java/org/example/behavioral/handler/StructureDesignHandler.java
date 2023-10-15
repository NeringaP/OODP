package org.example.behavioral.handler;

public class StructureDesignHandler extends ProjectHandler {

    public StructureDesignHandler() {
    }

    @Override
    public boolean design(Project project) {
        if(!project.getHasStructureDesign()) {
            System.out.println("Designing structure part");
            project.setHasStructureDesign(true);
            designNext(project);
            return false;
        }
        return designNext(project);
    }
}
