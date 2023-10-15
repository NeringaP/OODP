package org.example.behavioral.handler;

public class ProjectDesignService {
    private ProjectHandler handler;

    public ProjectDesignService(ProjectHandler handler) {
        this.handler = handler;
    }

    public boolean startDesign(Project project) {
        if(handler.design(project)) {
            return true;
        }
        return false;
    }
}
