package testdriventesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProfileClassUnitTest {
	
    private String name;

    public ProfileClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
	
}
