package Strings;

public class RevWordsInString {

	public static void revWords(String s) {
		
		String[] a = s.split(" ");
		String revString = "";
		for(int i=0;i<a.length;i++)
		{
			String revWord="";
			for(int j=a[i].length()-1;j>=0;j--)
			{
				revWord+=a[i].charAt(j);
			}
			revString+=revWord+" ";
		}
		System.out.println(revString);
	}
	public static void main(String[] args) {
		revWords("Hello How are you?");
	}
}
