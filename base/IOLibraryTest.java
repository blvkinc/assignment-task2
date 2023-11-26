package base;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.InetAddress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class IOLibraryTest {
    private String savedSystemInput;

    @Before
    public void saveSystemInput() {
        // Save the original System.in
        savedSystemInput = System.getProperty("line.separator");
    }

    @After
    public void restoreSystemInput() {
        // Restore the original System.in
        System.setProperty("line.separator", savedSystemInput);
    }

    @Test
    public void testGetString() {
        String inputString = "Test Input";
        IOLibrary.setStringForTest(inputString);

        String result = IOLibrary.getString();
        assertEquals(inputString, result.trim());
    }

    @Test
    public void testGetIPAddress() {
        String ipAddressString = "192.168.1.1";
        IOLibrary.setStringForTest(ipAddressString);

        InetAddress expected = null;
        try {
            expected = InetAddress.getByName(ipAddressString);
        } catch (Exception ignored) {
        }

        InetAddress result = IOLibrary.getIPAddress();
        assertNotNull(result);
        assertEquals(expected.getHostAddress(), result.getHostAddress());
    }
}
