import java.util.Scanner;

public class squarecubrroot {
	public static void main(String args[])
	{
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double i=Math.sqrt(a);
		double j=Math.cbrt(a);
		
		System.out.println("Square root of given number is "+i);
		System.out.println("Cube root of given number is "+j);
		
	}

}
