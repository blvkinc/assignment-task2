package base;

/**
 * Enum representing different language settings with associated messages.
 */
public enum LanguageSetting {
    ENGLISH("Enter your name:", "Welcome", "Have a good time playing Abominodo"),
    KLINGON("'el lIj pong:", "nuqneH", "QaQ poH Abominodo");

    private String[] messages;

    LanguageSetting(String... messages) {
        this.messages = messages;
    }

    /**
     * Retrieves a message based on the index.
     *
     * @param index The index of the message to retrieve
     * @return The message at the specified index
     */
    public String getMessage(int index) {
        return messages[index];
    }
}

/**
 * Represents a table of multilingual strings.
 * The class provides messages in different languages.
 * Manages the current language setting and message retrieval.
 * 
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */
public class MultiLingualStringTable {
    private static LanguageSetting currentLanguage = LanguageSetting.ENGLISH;

    /**
     * Retrieves a message based on the index and current language setting.
     *
     * @param index The index of the message to retrieve
     * @return The message in the selected language
     */
    public static String getMessage(int index) {
        return currentLanguage.getMessage(index);
    }

    /**
     * Sets the current language.
     *
     * @param language The language setting to be set
     */
    public static void setCurrentLanguage(LanguageSetting language) {
        currentLanguage = language;
    }

    /**
     * Gets the current language setting.
     *
     * @return The current language setting
     */
    public static LanguageSetting getCurrentLanguage() {
        return currentLanguage;
    }
}
