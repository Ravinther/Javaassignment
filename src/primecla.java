import java.util.Scanner;

public class primecla 
{
	public static void main(String args[]) 
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		primedata prime= new primedata();
		prime.prime(i);
	}
}
	class primedata
	{
		int i;
		
	public void prime(int i) {
		for(int j=2;j<i;j++)
		{
			boolean flag=true;
			if(i%j==0)
			{
				flag=false;
				break;
			}
			if(flag)
			{
				System.out.println(i +"is a prime number");
			}
		}
	}
}
