package javagenerics;

import java.util.*;
interface shape{
	void area();
}

class circle implements shape
{
	public float radius;
	public circle(float radius) {

		this.radius = radius;
		}
 public void area(){
		System.out.println("Area of circle:-  " + radius * radius*3.14);
	}
}

class square implements shape
{
	public float radius;
	public square(float radius) {

		this.radius = radius;
		}
 public void area(){
		System.out.println("Area of square:-  " + radius * radius);
	}
}


class boundedshape <T extends shape>
{
	
	public T a;

	void findArea() {
		a.area();
		}
}

public class genericsbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boundedshape<shape> b = new boundedshape<shape>();
		b.a = new circle(8);
		b.findArea();
		b.a = new square(4);
		b.findArea();
	}

}
