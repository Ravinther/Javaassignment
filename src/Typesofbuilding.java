
public class Typesofbuilding {

	public static void main(String[] args) {
		
		architecture ar=new architecture("Government", "Tata Groups", 2);
		architecture ar2=new architecture("Residential", "Anu groups",4);
		ar.price=30000;
		ar2.price=40000;
		System.out.println("Type of the Government building is "+ar.types);
		System.out.println("Name of the Government building is "+ar.name);
		System.out.println("Number of floor in the Government building is "+ar.getarc());
		System.out.println("No of floor in the building are"+ar.getmethod());
		System.out.println(" ");
		System.out.println("Type of the Residential building is "+ar2.types);
		System.out.println("Name of the Residential building is "+ar2.name);
		System.out.println("Number of floor in the Government building is "+ar2.getarc());
		System.out.println("No of floor in the building are "+ar2.getmethod());
			
	}
}

	



