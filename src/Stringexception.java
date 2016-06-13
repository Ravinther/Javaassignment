import java.util.Scanner;

public class Stringexception 
{
	public static void main(String args[])
	{
	System.out.println("ENter the string");
	Scanner sc=new Scanner(System.in);
	String db=sc.nextLine();
	try
	{
	String[] arr=new String[5];
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[7]);
	}
	}
	catch (ArrayIndexOutOfBoundsException e) 
	{
		System.out.println("You are selecting wrong element");
	}

}
	}
