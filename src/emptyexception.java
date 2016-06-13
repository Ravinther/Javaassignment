import java.util.Scanner;

public class emptyexception {

	public static void main(String[] args) 
	{
		String sr=null;
		try
		{
			if(sr==null)
			{
				System.out.println("The length of given cahracter is "+" ");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Check string might be empty");
		}
	}

}
