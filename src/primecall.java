import java.util.Scanner;

public class primecall {
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		functionpr prime=new functionpr();
	    System.out.println(prime.primefn(i));
	
	}

}
