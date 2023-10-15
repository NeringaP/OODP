package org.example.behavioral.handler;

public abstract class ProjectHandler {
    private ProjectHandler next;

    public ProjectHandler setNextHandler(ProjectHandler next) {
        this.next = next;
        return this;
    }
    public abstract boolean design(Project project);
    protected boolean designNext(Project project) {
        if(next == null) {
            System.out.println("Project is finished");
            return true;
        }
       return next.design(project);
    }
}
