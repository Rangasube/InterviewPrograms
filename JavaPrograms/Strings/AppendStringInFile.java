package Strings;

import java.io.FileWriter;
import java.io.IOException;

public class AppendStringInFile {
public static void appendToFile(String text) throws IOException {
	String path = "c:\\Users\\Sai Sharan\\Desktop\\abc.txt";
	FileWriter fw = new FileWriter(path, true);
	
	fw.write(text);
	fw.close();
	
	System.out.println("Done...");
}
public static void main(String[] args) {
	try {
		appendToFile("Hi There !!!");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
