package testdriventesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import testdriventesting.service.Assignment;
import testdriventesting.service.TaskType;
import testdriventesting.service.UnitList;

public class UnitListTest {


    private UnitList unitList;

    @Before
    public void setUp() {
        unitList = new UnitList();
    }

    @Test
    public void ShouldReturnCorrectUnitList() {
        String[] expectedUnitList = {"SIT707", "SIT737", "SIT791"};
        String[] actualUnitList = unitList.getUnitList();

        assertArrayEquals(expectedUnitList, actualUnitList);
    }

    @Test
    public void ShouldReturnCorrectAssignmentListForSIT707() {
    	 Assignment[] expectedAssignments = {
    			 new Assignment("Assignment 1", "12/04/2024", true, TaskType.PASS),
    	         new Assignment("Assignment 2", "15/04/2024", false, TaskType.CREDIT),
    	         new Assignment("Assignment 3", "11/08/2024", false, TaskType.DISTINCTION)
         };

         Assignment[] actualAssignments = unitList.getAssignmentListForUnit("SIT707");

         for (int i = 0; i < expectedAssignments.length; i++) {
             assertEquals(expectedAssignments[i].getName(), actualAssignments[i].getName());
             assertEquals(expectedAssignments[i].getDueDate(), actualAssignments[i].getDueDate());
             assertEquals(expectedAssignments[i].isCompleted(), actualAssignments[i].isCompleted());
             assertEquals(expectedAssignments[i].getTaskType(), actualAssignments[i].getTaskType());
         }
    }

    @Test
    public void ShouldReturnCorrectAssignmentListForSIT737() {
        Assignment[] expectedAssignments = {
        		 new Assignment("Assignment 1", "12/03/2024", true, TaskType.PASS),
                 new Assignment("Assignment 2", "15/04/2024", true, TaskType.CREDIT),
                 new Assignment("Assignment 3", "31/05/2024", true, TaskType.HIGH_DISTINCTION)
        };

        Assignment[] actualAssignments = unitList.getAssignmentListForUnit("SIT737");

        for (int i = 0; i < expectedAssignments.length; i++) {
            assertEquals(expectedAssignments[i].getName(), actualAssignments[i].getName());
            assertEquals(expectedAssignments[i].getDueDate(), actualAssignments[i].getDueDate());
            assertEquals(expectedAssignments[i].isCompleted(), actualAssignments[i].isCompleted());
            assertEquals(expectedAssignments[i].getTaskType(), actualAssignments[i].getTaskType());
        }
    }

    @Test
    public void ShouldReturnCorrectAssignmentListForSIT791() {
        Assignment[] expectedAssignments = {
                new Assignment("Assignment 1", "12/03/2024", false, TaskType.PASS),
                new Assignment("Assignment 2", "11/04/2024", true, TaskType.DISTINCTION),
                new Assignment("Assignment 3", "08/05/2024", false, TaskType.HIGH_DISTINCTION)
        };

        Assignment[] actualAssignments = unitList.getAssignmentListForUnit("SIT791");

        for (int i = 0; i < expectedAssignments.length; i++) {
            assertEquals(expectedAssignments[i].getName(), actualAssignments[i].getName());
            assertEquals(expectedAssignments[i].getDueDate(), actualAssignments[i].getDueDate());
            assertEquals(expectedAssignments[i].isCompleted(), actualAssignments[i].isCompleted());
            assertEquals(expectedAssignments[i].getTaskType(), actualAssignments[i].getTaskType());
        }
    }

    @Test
    public void ShouldReturnNullForUnidentifiedUnitCode() {
        Assignment[] actualAssignments = unitList.getAssignmentListForUnit("UNKNOWN");

        assertNull(actualAssignments);
    }
    
    @Test
    public void shouldReturnPassTasksForSIT737() {
        Assignment[] expectedAssignments = {
       		 new Assignment("Assignment 1", "12/03/2024", true, TaskType.PASS),

        };

        Assignment[] actualAssignments = unitList.filterAssignmentsByGrade(unitList.getAssignmentListForUnit("SIT737"), "HIGH_DISTINCTION");

        for (int i = 0; i < expectedAssignments.length; i++) {
            assertEquals(expectedAssignments[i].getName(), actualAssignments[i].getName());
            assertEquals(expectedAssignments[i].getDueDate(), actualAssignments[i].getDueDate());
            assertEquals(expectedAssignments[i].isCompleted(), actualAssignments[i].isCompleted());
            assertEquals(expectedAssignments[i].getTaskType(), actualAssignments[i].getTaskType());
        }
    }
    
    @Test
    public void shouldReturnCreditTasksForSIT737() {
        Assignment[] expectedAssignments = {
       		 new Assignment("Assignment 1", "12/03/2024", true, TaskType.PASS),
             new Assignment("Assignment 2", "15/04/2024", true, TaskType.CREDIT),

        };

        Assignment[] actualAssignments = unitList.filterAssignmentsByGrade(unitList.getAssignmentListForUnit("SIT737"), "HIGH_DISTINCTION");

        for (int i = 0; i < expectedAssignments.length; i++) {
            assertEquals(expectedAssignments[i].getName(), actualAssignments[i].getName());
            assertEquals(expectedAssignments[i].getDueDate(), actualAssignments[i].getDueDate());
            assertEquals(expectedAssignments[i].isCompleted(), actualAssignments[i].isCompleted());
            assertEquals(expectedAssignments[i].getTaskType(), actualAssignments[i].getTaskType());
        }
    }


    @Test
    public void shouldReturnDistinctionTasksForSIT737() {
        Assignment[] expectedAssignments = {
       		 new Assignment("Assignment 1", "12/03/2024", true, TaskType.PASS),
             new Assignment("Assignment 2", "15/04/2024", true, TaskType.CREDIT),
             

        };

        Assignment[] actualAssignments = unitList.filterAssignmentsByGrade(unitList.getAssignmentListForUnit("SIT737"), "HIGH_DISTINCTION");

        for (int i = 0; i < expectedAssignments.length; i++) {
            assertEquals(expectedAssignments[i].getName(), actualAssignments[i].getName());
            assertEquals(expectedAssignments[i].getDueDate(), actualAssignments[i].getDueDate());
            assertEquals(expectedAssignments[i].isCompleted(), actualAssignments[i].isCompleted());
            assertEquals(expectedAssignments[i].getTaskType(), actualAssignments[i].getTaskType());
        }
    }

    

    @Test
    public void shouldReturnHighDistinctionTasksForSIT737() {
        Assignment[] expectedAssignments = {
       		 new Assignment("Assignment 1", "12/03/2024", true, TaskType.PASS),
             new Assignment("Assignment 2", "15/04/2024", true, TaskType.CREDIT),
             new Assignment("Assignment 3", "31/05/2024", true, TaskType.HIGH_DISTINCTION)
        };

        Assignment[] actualAssignments = unitList.filterAssignmentsByGrade(unitList.getAssignmentListForUnit("SIT737"), "HIGH_DISTINCTION");

        for (int i = 0; i < expectedAssignments.length; i++) {
            assertEquals(expectedAssignments[i].getName(), actualAssignments[i].getName());
            assertEquals(expectedAssignments[i].getDueDate(), actualAssignments[i].getDueDate());
            assertEquals(expectedAssignments[i].isCompleted(), actualAssignments[i].isCompleted());
            assertEquals(expectedAssignments[i].getTaskType(), actualAssignments[i].getTaskType());
        }
    }


}