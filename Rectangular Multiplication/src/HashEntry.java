import java.util.ArrayList;


public class HashEntry {

	private ArrayList<Integer> values = new ArrayList<Integer>();
	private int sum=0;
	
	
	void addvalue(int value)
	{
		values.add(value);
	}
	
	 int sum()
	{
		 sum=0;
		for(int x : values)
		{
			sum=sum+x;
		}
		
		return sum;
	}
}
