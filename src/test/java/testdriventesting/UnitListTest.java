package testdriventesting.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UnitList {

    public String[] getUnitList() {
        // Return array of unit list
        return new String[] {"SIT707", "SIT737", "SIT791"};
    }

    public Assignment[] getAssignmentListForUnit(String unitCode) {
        // Logic to retrieve assignment list for the specified unit code
        Assignment[] assignments = new Assignment[3];

        if ("SIT707".equals(unitCode)) {
            assignments[0] = new Assignment("Assignment 1", "12/04/2024", true, TaskType.PASS);
            assignments[1] = new Assignment("Assignment 2", "15/04/2024", false, TaskType.CREDIT);
            assignments[2] = new Assignment("Assignment 3", "11/08/2024", false, TaskType.DISTINCTION);
            return assignments;
        } else if ("SIT737".equals(unitCode)) {
            assignments[0] = new Assignment("Assignment 1", "12/03/2024", true, TaskType.PASS);
            assignments[1] = new Assignment("Assignment 2", "15/04/2024", true, TaskType.CREDIT);
            assignments[2] = new Assignment("Assignment 3", "31/05/2024", true, TaskType.HIGH_DISTINCTION);
            return assignments;       
        } else if ("SIT791".equals(unitCode)) {
            assignments[0] = new Assignment("Assignment 1", "12/03/2024", false, TaskType.PASS);
            assignments[1] = new Assignment("Assignment 2", "11/04/2024", true, TaskType.DISTINCTION);
            assignments[2] = new Assignment("Assignment 3", "08/05/2024", false, TaskType.HIGH_DISTINCTION);
            return assignments;       
        } else {
            return null;
        }
    }

    public Assignment[] filterAssignmentsByGrade(Assignment[] assignments, String targetGrade) {
        List<Assignment> filteredAssignments = new ArrayList<>();
        int maxGrade = TaskType.valueOf(targetGrade).getLevel();
        
        for (Assignment assignment : assignments) {
            if (assignment.getTaskType().getLevel() <= maxGrade) {
                filteredAssignments.add(assignment);
            }
        }
        
        return filteredAssignments.toArray(new Assignment[0]);
    }
}
