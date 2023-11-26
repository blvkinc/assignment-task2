import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.net.InetAddress;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class ConnectionGeniusTest {

    private ConnectionGenius connectionGenius;
    private InetAddress mockInetAddress;

    @BeforeEach
    void setUp() {
        mockInetAddress = mock(InetAddress.class);
        connectionGenius = new ConnectionGenius(mockInetAddress);
    }

    @Test
    void testConnectionGeniusConstruction() {
        assertNotNull(connectionGenius);
        assertEquals(mockInetAddress, connectionGenius.getIpa());
    }

    @Test
    void testDownloadWebVersion() {
        connectionGenius.downloadWebVersion();
        // It's hard to test console output directly, but you can verify indirectly
        // For instance, you might check if the method was called with Mockito
        verify(connectionGenius, times(1)).printMessage("Getting specialised web version.");
        verify(connectionGenius, times(1)).printMessage("Wait a couple of moments");
    }

    @Test
    void testConnectToWebService() {
        connectionGenius.connectToWebService();
        // Similar verification for console output
        verify(connectionGenius, times(1)).printMessage("Connecting");
    }

    @Test
    void testAwayWeGo() {
        connectionGenius.awayWeGo();
        // Similar verification for console output
        verify(connectionGenius, times(1)).printMessage("Ready to play");
    }

    @Test
    void testFireUpGame() {
        connectionGenius.fireUpGame();
        // Verification for the sequence of method calls
        InOrder inOrder = inOrder(connectionGenius);
        inOrder.verify(connectionGenius).downloadWebVersion();
        inOrder.verify(connectionGenius).connectToWebService();
        inOrder.verify(connectionGenius).awayWeGo();
    }

    @Test
    void testGetIpa() {
        assertEquals(mockInetAddress, connectionGenius.getIpa());
    }

    @Test
    void testSetIpa() {
        InetAddress newInetAddress = mock(InetAddress.class);
        connectionGenius.setIpa(newInetAddress);
        assertEquals(newInetAddress, connectionGenius.getIpa());
    }
}
