package base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;

/**
 * Utility class for handling input/output operations.
 * 
 * This class provides methods for reading strings and IP addresses from the
 * console.
 * 
 * Author: Kevan Buckley, maintained by __student Version: 2.0, 2014
 */

public final class IOLibrary {
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	/**
	 * Reads a string from the console.
	 * 
	 * @return The string entered by the user.
	 */
	public static String getString() {
		do {
			try {
				return reader.readLine();
			} catch (Exception e) {
			}
		} while (true);
	}

	/**
	 * Reads an IP address from the console.
	 * 
	 * @return The IP address entered by the user.
	 */
	public static InetAddress getIPAddress() {
		do {
			try {
				String[] chunks = reader.readLine().split("\\.");
				byte[] data = { Byte.parseByte(chunks[0]), Byte.parseByte(chunks[1]), Byte.parseByte(chunks[2]),
						Byte.parseByte(chunks[3]) };
				return Inet4Address.getByAddress(data);
			} catch (Exception e) {
			}
		} while (true);
	}

}