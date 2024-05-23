package testdriventesting.service;

public enum TaskType {
    PASS(1, "Pass"),
    CREDIT(2, "Credit"),
    DISTINCTION(3, "Distinction"),
    HIGH_DISTINCTION(4, "High Distinction");

    private final int level;
    private final String name;

    TaskType(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public static String getTaskTypeName(int level) {
        for (TaskType taskType : values()) {
            if (taskType.getLevel() == level) {
                return taskType.getName();
            }
        }
        return null;
    }
}
