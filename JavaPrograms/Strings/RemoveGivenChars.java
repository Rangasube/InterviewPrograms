package Strings;

public class RemoveGivenChars {
	public static void removeChars(String s, char c)
	{

		int j = 0, count =0;
		char[] a = s.toCharArray();
		char[] temp = new char[a.length];
		for(int i=0;i<s.length();i++)
		{
			if(a[i]!=c)
			{
				temp[j++] = a[i]; 
			}else {
				count++;
			}
		}
		while(count>0)
		{
			temp[j++]='\0';
			count--;
		}
		System.out.println(temp);

	}
	public static void main(String[] args) {
		removeChars("malayalam",'a');
	}
}
