import java.util.Scanner;

public class Numberexception
{
	public static void main(String args[])
	{
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		try
		{
		int i=Integer.parseInt(s);
		System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
			System.out.println("Number Format exception");
		}
		
		
	}	

}
