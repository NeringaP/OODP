package org.example.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeProject implements IProject{
    private final List<IProject> projectsList = new ArrayList<>();

    public CompositeProject(IProject... projects) {
        projectsList.addAll(Arrays.asList(projects));
    }

    @Override
    public double calculateCost() {
        return projectsList.stream()
                .mapToDouble(IProject::calculateCost)
                .sum();
    }
}
