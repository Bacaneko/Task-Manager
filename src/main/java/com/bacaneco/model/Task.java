package com.bacaneco.model;

public abstract class Task {
    private String name;
    private String description;
    private long ID;
    private Status statusOfTask;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Status getStatusOfTask() {
        return statusOfTask;
    }

    public void setStatusOfTask(Status statusOfTask) {
        this.statusOfTask = statusOfTask;
    }
}
