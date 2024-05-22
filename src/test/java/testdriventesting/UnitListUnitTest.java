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

}
