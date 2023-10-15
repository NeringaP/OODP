package org.example.behavioral.memento;

import org.example.behavioral.handler.Project;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Project project = Project.newBuild()
                .withStructureDesign(true)
                .build();

        caretaker.save(project);

        project.setHasHvacDesign(true);
        caretaker.save(project);

        project.setHasExteriorDesign(true);
        System.out.println(project + "\n");

        caretaker.revert(project);
        System.out.println(project);
    }
}
