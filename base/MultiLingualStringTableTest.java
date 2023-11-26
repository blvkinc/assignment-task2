package base; // Ensure the correct package declaration

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultiLingualStringTableTest {

    @Test
    public void testGetMessageEnglish() {
        MultiLingualStringTable.setCurrentLanguage(MultiLingualStringTable.LanguageSetting.English);

        String expectedMessage = "Enter your name:";
        String actualMessage = MultiLingualStringTable.getMessage(0);

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testGetMessageKlingon() {
        MultiLingualStringTable.setCurrentLanguage(MultiLingualStringTable.LanguageSetting.Klingon);

        String expectedMessage = "'el lIj pong:";
        String actualMessage = MultiLingualStringTable.getMessage(0);

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testGetMessageOutOfBounds() {
        MultiLingualStringTable.setCurrentLanguage(MultiLingualStringTable.LanguageSetting.English);

        // Assuming the index is out of bounds for the English language messages array
        int outOfBoundsIndex = 5;
        String expectedMessage = null; // Expecting null for an out of bounds index
        String actualMessage = MultiLingualStringTable.getMessage(outOfBoundsIndex);

        assertEquals(expectedMessage, actualMessage);
    }
}
