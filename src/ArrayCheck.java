import java.util.ArrayList;

public class ArrayCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList ar=new ArrayList<>();
		ar.add("String 1");
		ar.add("String 2");
		ar.add("string 3");
		ar.add("String 4");
		
		for(int i=0;i<ar.size()-1;i++)
		{
			ar.remove(3);
			System.out.println(ar);
		}
		

	}

}
