import java.util.Scanner;

public class bankinterest
{	
	public static void main(String[] args)
	{
		System.out.println("Enter the Name of bank");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Enter the no of year");
		Scanner sc1=new Scanner(System.in);
		int s1=sc1.nextInt();
		System.out.println("Enter the Rate of Interest in bank");
		Scanner sc2=new Scanner(System.in);
		int s2=sc2.nextInt();
		System.out.println("Enter the Principle of paid in bank");
		Scanner sc3=new Scanner(System.in);
		double s3=sc3.nextDouble();
		bankinerface ic=new bankinerface(s2, s3, s, s1);
		sbibank sb=new sbibank(s2, s3, s, s1);
		icicibank ba=new icicibank(s2, s3, s, s1);
		sb.getrateofinterest();
		ic.getrateofinterest();
		ba.getrateofinterest();
	}
}

