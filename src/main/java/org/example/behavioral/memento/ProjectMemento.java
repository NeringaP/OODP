package org.example.behavioral.memento;

import org.example.behavioral.handler.Project;

public class ProjectMemento {
    private final boolean hasStructureDesign;
    private final boolean hasHvacDesign;
    private final boolean hasElectricalDesign;
    private final boolean hasExteriorDesign;

    public ProjectMemento(Project project) {
        this.hasStructureDesign = project.getHasStructureDesign();
        this.hasHvacDesign = project.getHasHvacDesign();
        this.hasElectricalDesign = project.getHasElectricalDesign();
        this.hasExteriorDesign = project.getHasExteriorDesign();
    }

    public boolean getHasStructureDesign() {
        return hasStructureDesign;
    }

    public boolean getHasHvacDesign() {
        return hasHvacDesign;
    }

    public boolean getHasElectricalDesign() {
        return hasElectricalDesign;
    }

    public boolean getHasExteriorDesign() {
        return hasExteriorDesign;
    }
}
