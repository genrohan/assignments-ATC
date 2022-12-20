package util;

public class Data {

	final public String url = "https://www.amazon.in";	//website URL on which test to be performed
	static private String hubIP = "192.168.0.100"; //set your hub IP address here
	static private String portNumber = "4444";	//set the port number on which your hub is running. default is 4444
	
	
	public String getUrl() {
		return url;
	}
	public static String getHubIP() {
		return hubIP;
	}
	public static String getPortNumber() {
		return portNumber;
	}
	
}
