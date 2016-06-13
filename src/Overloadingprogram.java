import java.util.Scanner;

import javax.swing.ScrollPaneConstants;

public class Overloadingprogram
{
public static void main(String args[]) 
{
System.out.println("Enter the First number");
 Scanner sc=new Scanner(System.in);
 int i=sc.nextInt();
 System.out.println("Enter the Second Number");
 Scanner sc2=new Scanner(System.in);
 int j=sc.nextInt();
 mthover mv=new mthover(i, j);
 System.out.println("Area of rectangle is "+mv.getmethod());
 System.out.println("Area of Traingle is "+mv.getmtd());
}

}
