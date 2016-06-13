import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyleFactory;

 class Printinterf
{
	int sqr;
	Printinterf(int i)
	{
		sqr=i;
	}
	public void print()
	{
		System.out.println("Assigned value is "+ sqr);
	}

}
class Printinterf1 extends Printinterf
{
	 Printinterf1(int i)
	{
		super(i);
	}
	 public void print()
	{
		double a=sqr*sqr;
		System.out.println("Square Of number is "+a);
	}
	 public static void main(String args[]) 
		{
			System.out.println("Enter the number");
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			Printinterf1 pn=new Printinterf1(i);
			pn.print();
		}	
}



