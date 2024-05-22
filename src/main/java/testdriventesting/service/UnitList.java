package testdriventesting.service;

import org.springframework.stereotype.Service;

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
            assignments[0] = new Assignment("Assignment 1", "12/04/2024", true);
            assignments[1] = new Assignment("Assignment 2", "15/04/2024", false);
            assignments[2] = new Assignment("Assignment 3", "11/08/2024", false);
            return assignments;
        } else if ("SIT737".equals(unitCode)) {
            assignments[0] = new Assignment("Assignment 1", "12/03/2024", true);
            assignments[1] = new Assignment("Assignment 2", "15/04/2024", true);
            assignments[2] = new Assignment("Assignment 3", "31/05/2024", true);
            return assignments;       
        } else if ("SIT791".equals(unitCode)) {
            assignments[0] = new Assignment("Assignment 1", "12/03/2024", false);
            assignments[1] = new Assignment("Assignment 2", "11/04/2024", true);
            assignments[2] = new Assignment("Assignment 3", "08/05/2024", false);
            return assignments;       
        } else {
            return null;
        }
    }
}
