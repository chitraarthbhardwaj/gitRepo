import java.util.ArrayList;

public class SetArrayListElement 
{

	public static void main(String[] args) 
	{
	ArrayList<String> ar=new ArrayList<>();
	ar.add("First element");
	ar.add("Second element");
	ar.add("Third element");
	ar.add("Fourth element");
	ar.add("First element");
	ar.add("First element");
	ar.add("First element");
	ar.add("First element");
	
	for(String al: ar)
	{
	if(ar.lastIndexOf("First element")!=-1)
	//System.out.println(ar.indexOf("First element"));		
	{
		ar.set(ar.indexOf("First element"),"it is first element");	
			System.out.println(ar);
			System.out.println(ar.indexOf("First element"));
		}
	}
	}
}

