import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arrlst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Ravi");
		arr.add("Kavi");
		arr.add("Pavi");
		arr.add("Savi");
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		System.out.println("=============");
		Iterator<String> str=arr.iterator();
		while (str.hasNext()) {
			System.out.println(str.next());
		}
		

	}

}
