import java.util.Scanner;

public class Ifelseprogram {
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are Eligile to vote");
		}
		else
		{
			System.out.println("Entered age is "+ age);
			System.out.println("You are not Eligilble to vote");
		}
		}
	}
