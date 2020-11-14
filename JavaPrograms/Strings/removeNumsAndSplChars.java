package Strings;

public class removeNumsAndSplChars {
	public static void main(String[] args) {
		
		String s ="sai@#$%^&*()-+/:;?>,.<!~ sharan012345678910"; 
		String a = s.replaceAll("[^a-zA-Z]", ""); //regex to remove all extra characters including spaces from the string
		System.out.println(a);
	}

}
