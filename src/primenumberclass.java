import java.util.Scanner;

public class primenumberclass {
	int prime;
	String text;
	
	public int prime(int i)
	{
		for(int j=2;j<i/2;j++)
		{
			boolean flag=true;
			if(i%j==0)
			{
				flag=false;
				break;
			}
			if(flag)
			{
				System.out.println("its is a prime number");
			}
		}
		return i;
	}
	
 public String returnvalue()
		 {
		 return text;
		 }


}
