package base;

import java.net.InetAddress;

/**
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */

public class ConnectionGenius {

	private InetAddress ipAddress;

	public ConnectionGenius(InetAddress ipa) {
		this.setIpa(ipAddress);
	}

	void setIpa(InetAddress ipAddress) {
		this.ipAddress = ipAddress;
	}

	public void fireUpGame() {
		downloadWebVersion();
		connectToWebService();
		awayWeGo();
	}

	
	public void downloadWebVersion() {
		printMessage("Getting specialised web version.");
		printMessage("Wait a couple of moments");
	}

	public void connectToWebService() {
		printMessage("Connecting");
	}

	public void awayWeGo() {
		printMessage("Ready to play");
	}

	private void printMessage(String message) {
		System.out.println(message);
	}

}
