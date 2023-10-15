package org.example.structural.composite;

public class ProjectCostService {
    private IProject project;

    public ProjectCostService() {
    }

    public void combineProjectComponents(IProject... projects) {
        this.project = new CompositeProject(projects);
    }

    public double calculateTotalCost() {
        return project.calculateCost();
    }
}
