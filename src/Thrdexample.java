import java.util.Scanner;

public class Thrdexample implements Runnable 
{
	private Thread t;
	private int i;
	public Thrdexample(int in) 
	{
		i=in;  
	}
	public void run()
	{
		for(int j=0;j<=10;j++)
		{
			if(j%2==0)
			{
				System.out.println("Main thread will be alive till the child thread is live");
				System.out.println("Printing the count"+j);
			}
			else if(j%2!=0)
			{
				
				System.out.println("Printing the count"+j);
			}
			{
				
			}
		if(j==10)
			{
				System.out.println("My thread run is over");
			}
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void start()
	{
		System.out.println("Starting time"+i);
		while(t==null)
		{
			t=new Thread(this);
			t.start();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int in=sc.nextInt();
		Thrdexample tr=new Thrdexample(in);
		tr.run();
		System.out.println("Main thread's run is over");
		// TODO Auto-generated method stub
	}

}
