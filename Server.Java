// Brandon Thacker - JAVA Server Reference

import java.io.*;
import java.net.*;

public class Server {
	String[] wordList = {"test1", "test2", "test3", "test4", "test5", "test6", "test7" };
	
	public static void main(String[] args) {
		Server serv = new Server();
		serv.start();
	}
	
	public void start(); {
		try {
			ServerSocket sSock = new ServerSocket(4242);
			
			// server will need to be in an infinite loop so it can handle requests
			while (true) {
				Socket sock = sSock.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String word = getWord();
				writer.println(word);
				writer.close();
				System.out.println(word);
			}
		}catch (IOException ex) {
			System.out.print("Something went wrong: ");
			ex.printStackTrace();
		}
	}
	
	public String getWord() {
		int random = (int) (Math.random() * wordList.length);
		return wordList[random];
	}
}

