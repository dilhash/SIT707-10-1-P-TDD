package testdriventesting.service;

public class Assignment {
    private String name;
    private String dueDate;
    private boolean completed;

    public Assignment(String name, String dueDate, boolean completed) {
        this.name = name;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public String getName() {
        return name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }
}
