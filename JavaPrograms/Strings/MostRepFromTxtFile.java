package Strings;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class MostRepFromTxtFile {
	public static void mostRepWord() throws Exception {
		String path = "c:\\Users\\Sai Sharan\\Desktop\\abc.txt";
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		BufferedReader reader = null;

		reader = new BufferedReader(new FileReader(path));
		String currentLine = reader.readLine();
		while(currentLine!=null)
		{
			String[] words = currentLine.toLowerCase().split(" ");

			for(String word : words)
			{
				if(hm.containsKey(word))
				{
					hm.put(word, hm.get(word)+1);
				}else {
					hm.put(word,1);
				}
			}

			currentLine = reader.readLine();
		}
		//getting the repeated word and its occurence
		String mostrepword = null;
		int count = 0;
		for(Entry<String, Integer> entry : hm.entrySet())
		{
			if(entry.getValue()>count)
			{
				mostrepword = entry.getKey();
				count = entry.getValue();
			}
		}
		System.out.println("Most rep word : "+mostrepword);
		System.out.println("Occurance : "+count);
		reader.close();
	}
public static void main(String[] args) throws Exception {
	mostRepWord();	
}
}
