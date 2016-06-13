public class rectraclass
	{
		int length,breadth;
		rectraclass(float i,float j)
		{
		length=(int) i;
		breadth=(int) j;
		}
		public int getdata()
		{
			return length*breadth;
		}
	}
	class triangle extends rectraclass
	{
		triangle(float i, float j)
		{
			super(i, j);
		}
		float a;
		float gettra()
		{
			a=(float)length/2*length*breadth;
			return (a);
		}
		
	}

