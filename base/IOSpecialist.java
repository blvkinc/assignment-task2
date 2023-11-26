package base;

/**
 * The IOSpecialist class provides a simplified interface for handling
 * input/output operations. It serves as a mediator between the client code and
 * the IOLibrary, encapsulating input-related functionality.
 * 
 * Author: Kevan Buckley, maintained by __student Version: 2.0, 2014
 */

public class IOSpecialist {
	/**
	 * Default constructor for the IOSpecialist class.
	 */
	public IOSpecialist() {
	}

	/**
	 * Retrieves a string from the console input using the IOLibrary.
	 * 
	 * @return The string entered by the user.
	 */
	public String getString() {
		return IOLibrary.getString();
	}
}