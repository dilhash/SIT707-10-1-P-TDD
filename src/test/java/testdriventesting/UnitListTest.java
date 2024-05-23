package testdriventesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import testdriventesting.service.Assignment;
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
                 new Assignment("Assignment 1", "12/04/2024", true),
                 new Assignment("Assignment 2", "15/04/2024", false),
                 new Assignment("Assignment 3", "11/08/2024", false)
         };

         Assignment[] actualAssignments = unitList.getAssignmentListForUnit("SIT707");

         for (int i = 0; i < expectedAssignments.length; i++) {
             assertEquals(expectedAssignments[i].getName(), actualAssignments[i].getName());
             assertEquals(expectedAssignments[i].getDueDate(), actualAssignments[i].getDueDate());
             assertEquals(expectedAssignments[i].isCompleted(), actualAssignments[i].isCompleted());
         }
    }

    @Test
    public void ShouldReturnCorrectAssignmentListForSIT737() {
        Assignment[] expectedAssignments = {
                new Assignment("Assignment 1", "12/03/2024", false),
                new Assignment("Assignment 2", "11/04/2024", true),
                new Assignment("Assignment 3", "08/05/2024", false)
        };

        Assignment[] actualAssignments = unitList.getAssignmentListForUnit("SIT791");

        for (int i = 0; i < expectedAssignments.length; i++) {
            assertEquals(expectedAssignments[i].getName(), actualAssignments[i].getName());
            assertEquals(expectedAssignments[i].getDueDate(), actualAssignments[i].getDueDate());
            assertEquals(expectedAssignments[i].isCompleted(), actualAssignments[i].isCompleted());
        }
    }

    @Test
    public void ShouldReturnCorrectAssignmentListForSIT791() {
        Assignment[] expectedAssignments = {
                new Assignment("Assignment 1", "12/03/2024", false),
                new Assignment("Assignment 2", "11/04/2024", true),
                new Assignment("Assignment 3", "08/05/2024", false)
        };

        Assignment[] actualAssignments = unitList.getAssignmentListForUnit("SIT791");

        for (int i = 0; i < expectedAssignments.length; i++) {
            assertEquals(expectedAssignments[i].getName(), actualAssignments[i].getName());
            assertEquals(expectedAssignments[i].getDueDate(), actualAssignments[i].getDueDate());
            assertEquals(expectedAssignments[i].isCompleted(), actualAssignments[i].isCompleted());
        }
    }

    @Test
    public void ShouldReturnNullForUnidentifiedUnitCode() {
        Assignment[] actualAssignments = unitList.getAssignmentListForUnit("UNKNOWN");

        assertNull(actualAssignments);
    }


}
