package testdriventesting.service;

public class Assignment {
    private String name;
    private String dueDate;
    private boolean completed;
    private TaskType taskType;

    public Assignment(String name, String dueDate, boolean completed, TaskType taskType) {
        this.name = name;
        this.dueDate = dueDate;
        this.completed = completed;
        this.taskType = taskType;
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

    public TaskType getTaskType() {
        return taskType;
    }

    public String getTaskTypeName() {
        return taskType.getName();
    }
}
