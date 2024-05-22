package testdriventesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitListUnitTest {

	@Test
	public void ShouldReturnUnitList() {
		 // Arrange
        UnitList unitList = new UnitList();

        // Act
        String[] actualUnitNames = unitList.getUnitList();

        // Assert
        // Intentionally failing test by asserting against incorrect values
        assertArrayEquals(new String[]{"SIT707", "SIT737", "SIT791"}, actualUnitNames);
	}
	
	@Test
	public void ShouldReturnCorrectAssignmentListforSIT707() {
		//should return array with below info
		//assingment 1, due date:12/04/2024, completion status:true
		//assingment 2, due date:15/04/2024, completion status:false
		//assingment 3, due date:11/08/2024, completion status:false
		
		 // Arrange
        UnitList unitList = new UnitList();

        // Act
        Assignment [] actualAssignments = unitList.getAssignmentListForUnit("SIT707");
        // Act
       

        // Assert
        // Intentionally failing test by asserting against incorrect values
        assertEquals(3, actualAssignments.length);
        assertEquals("Assignment 1", actualAssignments[0].getName());
        assertEquals("12/04/2024", actualAssignments[0].getDueDate());
        assertTrue(actualAssignments[0].isCompleted());
        
        assertEquals("Assignment 2", actualAssignments[1].getName());
        assertEquals("15/04/2024", actualAssignments[1].getDueDate());
        assertFalse(actualAssignments[1].isCompleted());
        
        assertEquals("Assignment 3", actualAssignments[2].getName());
        assertEquals("11/08/2024", actualAssignments[2].getDueDate());
        assertFalse(actualAssignments[2].isCompleted());
	}

}
