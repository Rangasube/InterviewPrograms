package Arrays;

public class ObjectArray {
	public static void main(String[] args) {
		
		/*Disadvantage of arrays
		 * 1. They are static : we cannot change the size of array once the size is declared : to overcome this we use collections(Arraylist and HashTable they are dynamic in nature)
		 * 2. They store only similar data types : to overcome this issue, we can use Object[] array to store diff types of data
		 */	
		
		
		Object[] ob = new Object[6];
		ob[0] = 1;
		ob[1] = "Mani";
		ob[2] = "M";
		ob[3] = "02-05-1996";
		ob[4] = "Automation Engineer";
		ob[5] = "Bengaluru";
		
		System.out.println("Size of an array : "+ob.length);
		for(int i=0; i<ob.length; i++)
		{
			System.out.println(ob[i]);
		}
		
	}
}
