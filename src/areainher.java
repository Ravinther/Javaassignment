import java.util.Scanner;

public class areainher {

	public static void main(String[] args)
	{
		System.out.println("Enter the first number");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println("Enter the Second number");
		Scanner sc1=new Scanner(System.in);
		int j=sc1.nextInt();
		triangle tr=new triangle(i,j);
		System.out.println("Area of rectangle"+tr.getdata());
		System.out.println("Area of Triangle"+tr.gettra());
		
	}
	
	}
	
