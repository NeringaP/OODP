package org.example.behavioral.handler;

public class Main {
    public static void main(String[] args) {
        Project project = Project.newBuild()
//                .withStructureDesign(true)
//                .withElectricalDesign(true)
//                .withHvacDesign(true)
//                .withExteriorDesign(true)
                .build();

        ProjectHandler handlerStructure = new StructureDesignHandler()
                .setNextHandler(new HvacDesignHandler()
                .setNextHandler(new ElectricalDesignHandler()
                .setNextHandler(new ExteriorDesignHandler())));

        ProjectDesignService service = new ProjectDesignService(handlerStructure);
        service.startDesign(project);
    }
}
