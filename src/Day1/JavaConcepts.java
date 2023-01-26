package Day1;

public class JavaConcepts {
	
	public static void main(String[] args)
	{
		/*
	int a = 10, b=20 ,c = 0;
			
	
	System.out.println("The value of a:" + a + ','  +"The value of b:" + b);
	
	//c = a;
	
	//a = b;
	
	//b = c;
	
	a= a+10;
	b = b-10;
	System.out.println("The value of a:" + a + ','  +"The value of b:" + b);
	
	}
}
/*
1)  Count Number of Digits in a Number

Input : 423424
output : 6

Video Link: https://www.youtube.com/watch?v=CnFBzBMEdMg


int num = 4234;
int count = 0;

while(num!=0)
{
num = num/10;
count = count +1;

}

System.out.println(count);
}

}
		*/
		
		
/*		
//2) Count Number of Even and Odd digits in a Number
//Input: 23456
//Output : 3 even  2 odd

int num = 23456;
int evencount = 0;
int oddcount=0;

while(num!=0)
{

int rem = num%10;

	if(rem%2==0)
	{
		evencount = evencount+1;
		
	}
	

	else
	{
		oddcount = oddcount+1;
		
	}
	
	num = num/10;
	
}
System.out.println("Count of even numbers is :" + evencount);	
System.out.println("Count of odd numbers is :" + oddcount);	
	}
}

*/

//3) Find Sum of Digits in a Number
//Input: 1234
//output: 10


		int num = 11111;
		int add = 0;
		int rem=0;

		while(num!=0)
		{

		    rem = num%10;

			add = rem+add;
			
			num = num/10;
			
		}
		
		System.out.println("The total cout of num:" + add);
		
	}
}