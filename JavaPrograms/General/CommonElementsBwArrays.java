package General;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsBwArrays {
public static Set<String> commonElements(String[] a,String[] b){
	
	HashSet<String> set = new HashSet<String>();
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i].equals(b[j]))
			{
				set.add(a[i]);
			}
		}
	}
	System.out.println(set);
	return set;
}
public static void main(String[] args) {
	String[] a = {"Mani","Sai","Sharan","Rangs"};
	String[] b = {"Kunal","Sharan","Rangs","Kiran"};
	
	commonElements(a,b);
}
}
