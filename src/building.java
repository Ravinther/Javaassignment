
	public class building
	{
		String types,name;
		int no_of_floors;
		double price;
		
		building(String i,String j,int floors)
		{
		 types=i;
		 name=j;
		 no_of_floors =floors;
		}
		public double getmethod()
		{
			return price;
		}
	}
	class architecture extends building
	{

		architecture(String i, String j, int floors) {
			super(i, j, floors);
			// TODO Auto-generated constructor stub
		}
		public int getarc()
		{
			int noofrooms=2;
			return no_of_floors*noofrooms;
		}
	}
