import java.util.Scanner;

public class Arrayexception
{
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int db=sc.nextInt();
		try
		{
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
			System.out.print(arr[7]);
		}
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("You are selecting wrong element");
		}
		
	}

}
