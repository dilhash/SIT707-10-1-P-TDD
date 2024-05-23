package testdriventesting.service;

public class AssignmentRecord {
    private String unitCode;
    private Assignment[] assignments;

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Assignment[] getAssignments() {
        return assignments;
    }

    public void setAssignments(Assignment[] assignments) {
        this.assignments = assignments;
    }
}
