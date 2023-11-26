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
	private enum LanguageSetting {
		English, Klingon
	}

	/**
	 * The currently selected language setting.
	 */
	private static LanguageSetting currentSelectedLanguage = LanguageSetting.English;

	/**
	 * Array of messages in English language.
	 */
	private static String[] englishLanguageMessage = { "Enter your name:", "Welcome",
			"Have a good time playing Abominodo" };

	/**
	 * Array of messages in Klingon language.
	 */
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
			return englishLanguageMessage[index];
		} else {
			return klingonLanguageMessage[index];
		}

	}
}