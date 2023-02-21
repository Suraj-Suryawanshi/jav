package javagenerics;
import java.util.*;



class generic <T extends Number>
{
	T[] array1;
	
 
	
	public generic(T[] array)
	{
		array1 = array;
	}
	
	public double calculateAverage()
	{
		double total = 0;
		for(T e : array1)
		{
			
			total += e.intValue();
		}
		
		return total/array1.length;
	}
	
	
	public void equals(generic<Number> otherarray)
	{
		if(this.calculateAverage() == otherarray.calculateAverage())
		{
			System.out.println("Both Array Objects are Equal");
			

		}
		else
		{
			System.out.println("Both Array Objects aren't Equal");

		}
	}
}


public class genericarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1,2,3,4,5};
		generic<Integer> obj1 = new generic<>(arr);
		Double arr1[] = {1.0,2.0,3.0,4.0,5.0};
		generic<Number> obj2 = new generic<>(arr1);
		obj1.equals(obj2);
	}

}
