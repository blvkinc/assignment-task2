import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuoteCollectionTest {

    @Test
    public void testQuotesExist() {
        String[] quotes = QuoteCollection.quotes;
        Assertions.assertNotNull(quotes);
        Assertions.assertTrue(quotes.length > 0);
    }

    @Test
    public void testQuotesStructure() {
        String[] quotes = QuoteCollection.quotes;
        Assertions.assertEquals(0, quotes.length % 2, "Each quote should have both a quote and an author");

        for (int i = 0; i < quotes.length; i += 2) {
            String quote = quotes[i];
            String author = quotes[i + 1];

            Assertions.assertNotNull(quote, "Quote should not be null");
            Assertions.assertFalse(quote.isEmpty(), "Quote should not be empty");
            Assertions.assertNotNull(author, "Author should not be null");
            Assertions.assertFalse(author.isEmpty(), "Author should not be empty");
        }
    }

    // Add more tests as needed
}
