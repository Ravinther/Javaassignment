import java.util.Scanner;

public class calculator
{

	public static void main(String[] args) 
	{
		System.out.println("Enter which method to run:");
		System.out.println("1.sum Of Number");
		System.out.println("2.subtract of number");
		System.out.println("3.Multiplication of number");
		System.out.println("4.Division of two number");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		calcpackage cal=new calcpackage();
		System.out.println("Enter the first number");
		Scanner sc1=new Scanner(System.in);
		int i=sc1.nextInt();
		System.out.println("Enter the second number");
		Scanner sc2=new Scanner(System.in);
		int j=sc2.nextInt();
		switch(c)
		{
		case 1:
		{
			System.out.println(cal.sum(i, j));
			break;
		}
		case 2:
		{
			System.out.println(cal.sub(i, j));
			break;
		}
		case 3:
		{
			System.out.println(cal.mul(i, j));
			break;
		}
		case 4:
		{
			System.out.println(cal.division(i, j));
			break;
		}
	  }

	}
}