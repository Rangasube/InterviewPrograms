package Strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AllCountsFromTextFile {
public static void counts(String path) throws IOException {
	BufferedReader reader = new BufferedReader(new FileReader(path));
	String line;
	
	int wordCount = 0;
	int lineCount =0;
	int charCount = 0;
	int paraCount = 1;
	int whiteSpaceCount =0;

	while((line=reader.readLine())!=null)
	{
		if(line.equals(""))
		{
			paraCount++;
		}else {
			charCount+=line.length();
			String[] wordArr = line.split(" ");

			wordCount += wordArr.length;
			whiteSpaceCount =+ wordCount-1;

			String[] lineArr = line.split("[!?.:]+");
			lineCount +=lineArr.length;
		}
	}
	reader.close();
	System.out.println("wordCount : "+wordCount);
	System.out.println("lineCount : "+lineCount);
	System.out.println("charCount : "+charCount);
	System.out.println("paraCount : "+paraCount);
	System.out.println("whiteSpaceCount : "+whiteSpaceCount);
}
public static void main(String[] args) throws IOException {
	String path = "c:\\Users\\Sai Sharan\\Desktop\\abc.txt";
	counts(path);
}
}

