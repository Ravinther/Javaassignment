
public class functionpr {
	int prime;
	
	public int primefn(int i)
	{
		boolean temp=true;
		for(int j=1;j<i/2;j++)
		{
			if(j%i==0)
			{
				temp=false;
				break;
			}
		}
		if(temp)
		{
			System.out.println(i +" Is a prime number");
		}
		return i;
	}

}
