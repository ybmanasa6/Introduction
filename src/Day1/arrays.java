package Day1;

public class arrays {

	public static void main(String[] args) {
/* Find Sum of Elements in Array		
		int a[]= {1,2,3};
		int count=0;
		
		for(int x:a)
		{
			count = count+x;
		}
		
		
		System.out.println(count);
		
*/
		
/* Print Even and Odd numbers  from array */
		
		int a[] = {1,2,3,4,5,6,7};
		
		int even_count=0;
		int odd_count=0;
		int rev=0;
		
		for(int x:a)
		{
			if(x%2==0)
			even_count = even_count+1;
			else
			odd_count = odd_count+1;
				
		}
		System.out.println(even_count);
		System.out.println(odd_count);
	}

}
