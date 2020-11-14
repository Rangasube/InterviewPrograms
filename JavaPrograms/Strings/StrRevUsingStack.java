package Strings;

import java.util.Stack;

public class StrRevUsingStack {
public static void main(String[] args) {
	String s = "Saisharan";
	//converitng string to charArray
	char[] charArray = s.toCharArray();
	
	//creating an empty stack
	Stack<Character> container = new Stack<Character>();
	
	//add characters of charArray to stack
	for(char c: charArray) {
		container.push(c);
	}
	
	//create an empty string
	String revString = "";
	
	//iterating a stack and creating a revStr
	while(!container.isEmpty())
	{
		revString = revString+String.valueOf(container.pop())+" ";
	}
	System.out.println("Given String: "+s);
	System.out.println("Reversed String: "+revString);
}
}
