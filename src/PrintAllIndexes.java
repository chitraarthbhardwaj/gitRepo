import java.util.ArrayList;

public class PrintAllIndexes {

	public static void main(String[] args) 
	{
	
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(33);
		ar.add(34);
		ar.add(35);
		ar.add(36);
		ar.add(37);
		ar.add(38);
		ar.add(39);
		ar.add(40);
		ar.add(41);
		ar.add(42);
		ar.add(43);
		ar.add(44);
		
		for(int i: ar)
		{
			System.out.println(ar.indexOf(i));
		}

	}
}
