
class bankinerface
{
   double amount,principle;
   String bank_name;
   int no_of_year;
   
   bankinerface(double i,double j,String k,int l)
   {
	   i=amount;
	   j=principle;
	   k=bank_name;
	   l=no_of_year;
	
   }
   
   public double getrateofinterest()
   {
	   double a;
	   a=(1/no_of_year)*(amount/principle-1);
	   return a;
   }
   
   class sbibank extends bankinerface
   {
	   sbibank(double i,double j,String k,int l)
	   {
	    super(i, j, k, l);
	   }
	   public double getrateofinterest()
	   {
		   double a;
		   a=(1/no_of_year)*(amount/principle-1);
		   return a;
	   }
   }
   class icicibank extends bankinerface 
   {
	 icicibank(double i, double j, String k, int l) 
	 {
		super(i, j, k, l);
	  }

	public double getrateofinterest()
	   {
		   double a;
		   a=(1/no_of_year)*(amount/principle-1);
		   return a;
	   }

   }
}
	
   
