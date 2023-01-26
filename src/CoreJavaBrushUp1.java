import java.util.Scanner;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
/*
1) Largest of 2 numbers	
	--> using if..else
	---> ternary operator

2) Smallest of 3 numbers ( if...else)

3) Print week number by taking week name as input ( using switch case)

4) Print month name by taking month number as an input (using swich case).
		 */

/*

//Largest of 2 numbers	
--> using if..else/*******************************************
--> ternary operator
		
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		if(a>b)
		{
			System.out.println("a is the largest number"+a);
		}
		
		else if (b>a)
		{
			System.out.println("b is the largest number:"+b);
		}
		
	}

}

*/
/*/using Ternary operator/****************************
		
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();

String res = (a>b)?"a is the largest number":"b is the largest number";
System.out.println(res);

	}
}
*/


/*

//Smallest of 3 numbers ( if...else)

Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();


if(a<b && a<c)
{
	System.out.println("a is the smallest number"+a);
}

else if (b<a && b<c)
{
	System.out.println("b is the largest number:"+b);
}
else
{
	System.out.println("c is the largest number:"+b);
}
}

*/
		

//Print week number by taking week name as input ( using switch case)
	
Scanner sc = new Scanner(System.in);

String week_name = sc.next();

switch(week_name)
{
		
	case "Sunday": System.out.println("one");break;
    
	case "Monday": System.out.println("Two");break;
    
	case "Tuesday": System.out.println("Three");break;
    
	case "Wednesday": System.out.println("Four");break;
    
	case "Thursday": System.out.println("Five");break;
	
	case "Friday": System.out.println("Six");break;
	
	case "Saturday": System.out.println("Seven");break;

	default :System.out.println("Invalid week day");break;

}

	}
}

