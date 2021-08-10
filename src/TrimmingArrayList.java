import java.util.ArrayList;

public class TrimmingArrayList 
{
	public static void main(String[] args) 
	{	
		ArrayList<Integer> sb=new ArrayList<>();
		sb.add(23);
		sb.add(32);
		sb.add(33);
		sb.add(43);
		sb.add(44);
		sb.add(45);
		sb.add(46);
		sb.add(47);
		sb.add(48);
		sb.add(49);
		sb.add(50);

		System.out.println(sb.size());
		for(int i=0;i<sb.size()-1;i++)
		{
		if(sb.indexOf(i)==47)
				sb.trimToSize();
			
		}
		System.out.println(sb);
		System.out.println(sb.size());
		sb.add(51);
		System.out.println(sb);
	}
}
