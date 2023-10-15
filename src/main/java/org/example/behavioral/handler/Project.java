package org.example.behavioral.handler;

import org.example.behavioral.memento.ProjectMemento;

public class Project {
    private boolean hasStructureDesign;
    private boolean hasHvacDesign;
    private boolean hasElectricalDesign;
    private boolean hasExteriorDesign;

    private Project(Builder builder) {
        this.hasStructureDesign = builder.hasStructureDesign;
        this.hasHvacDesign = builder.hasHvacDesign;
        this.hasElectricalDesign = builder.hasElectricalDesign;
        this.hasExteriorDesign = builder.hasExteriorDesign;
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

    public void setHasStructureDesign(boolean hasStructureDesign) {
        this.hasStructureDesign = hasStructureDesign;
    }

    public void setHasHvacDesign(boolean hasHvacDesign) {
        this.hasHvacDesign = hasHvacDesign;
    }

    public void setHasElectricalDesign(boolean hasElectricalDesign) {
        this.hasElectricalDesign = hasElectricalDesign;
    }

    public void setHasExteriorDesign(boolean hasExteriorDesign) {
        this.hasExteriorDesign = hasExteriorDesign;
    }

    public static Builder newBuild() {
        return new Builder();
    }

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public ProjectMemento save() {
        return new ProjectMemento(this);
    }

    public void revert(ProjectMemento project) {
        this.hasStructureDesign = project.getHasStructureDesign();
        this.hasHvacDesign = project.getHasHvacDesign();
        this.hasElectricalDesign = project.getHasElectricalDesign();
        this.hasExteriorDesign = project.getHasExteriorDesign();
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    @Override
    public String toString() {
        return "Project{" +
                "hasStructureDesign=" + hasStructureDesign +
                ", hasHvacDesign=" + hasHvacDesign +
                ", hasElectricalDesign=" + hasElectricalDesign +
                ", hasExteriorDesign=" + hasExteriorDesign +
                '}';
    }

    public static class Builder {
        private boolean hasStructureDesign;
        private boolean hasHvacDesign;
        private boolean hasElectricalDesign;
        private boolean hasExteriorDesign;

        public Builder withStructureDesign(boolean hasStructureDesign) {
            this.hasStructureDesign = hasStructureDesign;
            return this;
        }

        public Builder withHvacDesign(boolean hasHvacDesign) {
            this.hasHvacDesign = hasHvacDesign;
            return this;
        }

        public Builder withElectricalDesign(boolean hasElectricalDesign) {
            this.hasElectricalDesign = hasElectricalDesign;
            return this;
        }

        public Builder withExteriorDesign(boolean hasExteriorDesign) {
            this.hasExteriorDesign = hasExteriorDesign;
            return this;
        }

        public Project build() {
            return new Project(this);
        }
    }
}
