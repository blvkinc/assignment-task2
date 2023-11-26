package base;

/**
 * The MultiLingualStringTable class provides a mechanism for managing and
 * retrieving messages in different languages.
 * 
 * Author: Kevan Buckley, maintained by __student Version: 2.0, 2014
 */
public class MultiLingualStringTable {
    /**
     * Enumeration representing the available language settings.
     */
    public enum LanguageSetting {
        English, Klingon
    }

    // Default language setting
    private static LanguageSetting currentSelectedLanguage = LanguageSetting.English;

    // Messages in English language
    private static String[] englishLanguageMessage = { "Enter your name:", "Welcome",
            "Have a good time playing Abominodo" };

    // Messages in Klingon language
    private static String[] klingonLanguageMessage = { "'el lIj pong:", "nuqneH", "QaQ poH Abominodo" };

    /**
     * Retrieves the message at the specified index based on the current language
     * setting.
     *
     * @param index The index of the message to retrieve.
     * @return The message in the current language at the specified index.
     */
    public static String getMessage(int index) {
        if (currentSelectedLanguage == LanguageSetting.English) {
            return getMessageFromLanguageArray(englishLanguageMessage, index);
        } else {
            return getMessageFromLanguageArray(klingonLanguageMessage, index);
        }
    }

    // Helper method to get message from the language-specific array
    private static String getMessageFromLanguageArray(String[] languageArray, int index) {
        if (index >= 0 && index < languageArray.length) {
            return languageArray[index];
        } else {
            return null;
        }
    }

    /**
     * Sets the current language setting.
     *
     * @param language The language to set as the current selected language.
     */
    public static void setCurrentLanguage(LanguageSetting language) {
        currentSelectedLanguage = language;
    }
}
