package org.example.behavioral.memento;

import org.example.behavioral.handler.Project;

import java.util.Stack;

public class Caretaker {
    private Stack<ProjectMemento> projectHistory = new Stack<>();

    public void save(Project project) {
        projectHistory.push(project.save());
    }

    public void revert(Project project) {
        project.revert(projectHistory.pop());
    }
}
