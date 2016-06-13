
public class mthover {
	int length,breadth;
	mthover(int i,int j) {
		length=(int)i;
		breadth=(int)j;
		
	}
	int getmethod()
	{
		return length*breadth;
		
	}
	
	public mthover(float i,float j)
	{
		length=(int)i;
		breadth=(int)j;
	}
	float getmtd()
	{
		return length/2*length*breadth;
	}

}
