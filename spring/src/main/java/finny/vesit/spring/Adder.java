package finny.vesit.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Adder {

private int a,b;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@AfterReturning("execution(public int multiplier())")
	public void Addition() {
		System.out.println("Addition of numbers "+a+" and "+b+" = "+(a+b));
	}

	
}
