import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args)
	{
	HashSet<String> has=new HashSet<String>();
	has.add("Ravi");
	has.add("Ruban");
	has.add("Gokul");
	has.add("Arun");
	Iterator<String> arr=has.iterator();
	while (arr.hasNext())
	{
		System.out.println(arr.next());
		
	}
	}

}
