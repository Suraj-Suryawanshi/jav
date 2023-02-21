package finny.java.exam;

import java.util.*;


class shape{
	void area()
	{
		System.out.println("This function prints area");
	}
}

class circle extends shape{
	
	int radius;
	
	circle(int r)
	{
		radius = r;
	}
	
	@Override
	void area()
	{
		System.out.println("Area of circle is :- " + radius*radius);
	}
	
}

class square extends shape{
	
	int radius;
	
	square(int r)
	{
		radius = r;
	}
	
	@Override
	void area()
	{
		System.out.println("Area of Square is :- " + radius*radius*radius);
	}
	
}

class bounded<t extends shape>
{
	t sh;
	bounded(t sh)
	{
		this.sh = sh;
	}
	
	void findarea()
	{
		sh.area();
	}
}

public class normal {

	public static void main(String[] args) {
		
		bounded<circle> b = new bounded(new circle(4));
		b.findarea();

	}

}
