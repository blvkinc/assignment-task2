package base;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class QuoteCollectionTest {
    private static String[] quotes;

    @BeforeClass
    public static void setUp() {
        quotes = QuoteCollection.quotes;
    }

    @Test
    public void testQuotesNotNull() {
        assertNotNull("Quotes array should not be null", quotes);
    }

    @Test
    public void testQuotesNotEmpty() {
        assertTrue("Quotes array should not be empty", quotes.length > 0);
    }

    @Test
    public void testQuotesStructure() {
        if (quotes.length == 0) {
            fail("No quotes found");
        }
    }
}
