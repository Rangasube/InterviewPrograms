
public class RemoveDupCharsFromString {

	public static void removeDupChar(String s) {
		char[] a = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<a.length;i++)
		{
			boolean repeated = false;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					repeated = true;
					break;
				}
			}
			if(!repeated)
			{
				sb.append(a[i]);
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) {
		removeDupChar("Daaaaaaaaaammmmmmmmmmmmmnnnnnnnnnnnnnnn!!!!!!!");
	}
}
