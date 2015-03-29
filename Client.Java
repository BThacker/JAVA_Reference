// Brandon Thacker - JAVA Client Reference

import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) {
		Client chatTest = new Client();
		chatTest.start();
	}
	
	public void start() {
		// Build connection, get words, print
		try {
			Socket sock = new Socket("127.0.0.1", 4242);
			InputStreamReader sReader = new InputStreamReader(sReader.getInputStream());
			BufferedReader read = new BufferedReader(sReader);
			
			String words = read.readLine();
			System.out.println("Here are words: " +words);
			read.close();
			
			
		}catch (IOException ex) {
			System.out.print("Something went wrong: ");
			ex.printStackTrace();
		}
	}

}
