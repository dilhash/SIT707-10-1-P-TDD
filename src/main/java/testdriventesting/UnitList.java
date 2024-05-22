package testdriventesting;

public class UnitList {
	
	public String[] getUnitList() {
		//return array of unit list
		return new String[] {"SIT707","SIT737","SIT791"};
	}

	public Assignment[] getAssignmentListForUnit(String unitCode) {
        // Logic to retrieve assignment list for the specified unit code
		
        Assignment[] assignments = new Assignment[3];
		
		if(unitCode == "SIT707") {
        assignments[0] = new Assignment("Assignment 1", "12/04/2024", true);
        assignments[1] = new Assignment("Assignment 2", "15/04/2024", false);
        assignments[2] = new Assignment("Assignment 3", "11/08/2024", false);
        return assignments;
		}
		else
			return null;
    }

}
