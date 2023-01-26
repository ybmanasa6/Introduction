package Day1;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=141;
		int orig_num = num;
		int rev=0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			
			
			num = num/10;
			
		}
		
		
		System.out.println("Pallindrome:"+rev);
		
		if(orig_num == rev)
		{
			System.out.println("its a pallindrome");
		}
		else
		{
			System.out.println("ITs not a pallindrome");
		}
		
		System.out.println("Adding additional changes to track git ");
	}

}
