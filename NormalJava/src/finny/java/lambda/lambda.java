package finny.java.lambda;

interface triangle
{
	public int area(int a,int b);
}

public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triangle a = (int c,int b)->{
			return c+b;
		};
		
		System.out.println("Area of triancgle is :- " + a.area(3, 4));

	}

}
