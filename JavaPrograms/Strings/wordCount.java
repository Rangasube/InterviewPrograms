package Strings;

public class wordCount {
public static void wordCount(String s) {
	
	//converting string into string array
	String[] a = s.split(" ");
	
	//printing the count of words in string
	System.out.println("Word Count"+" : "+a.length);
	
	// printing the words in a given string
	for(String l : a )
		System.out.println(l+" ");
}

//driver code to run call a method
public static void main(String[] args) {
	wordCount("my name is saisharan rangasube");
}

}
