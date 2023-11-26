package base;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IOSpecialistTest {

    @Test
    public void testGetString() {
        IOSpecialist ioSpecialist = new IOSpecialist();
        // Mocking IOLibrary.getString() for testing purposes
        // Replace this mock with the actual test scenario if available
        IOLibrary.setStringForTest("Test Input");

        String result = ioSpecialist.getString();
        assertEquals("Test Input", result);
    }
}
