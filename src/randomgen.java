import java.util.Random;
import java.util.Scanner;

public class randomgen {
	public static void main(String args[]) 
	{
		Random num=new Random();
		System.out.println("Enter the number");
		Scanner ac=new Scanner(System.in);
		int n=ac.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println((int)(Math.random()*100));
		}
	}

}
