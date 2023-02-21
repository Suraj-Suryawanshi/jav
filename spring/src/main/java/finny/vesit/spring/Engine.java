package finny.vesit.spring;


	import org.aspectj.lang.annotation.After;
	import org.aspectj.lang.annotation.Aspect;
	import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

	@Aspect
	public class Engine {

		@Before("myPointcut()")
		public void enginestart() {
			System.out.println("The engine has started now.");
		}
		
		@After("myPointcut()")
		public void enginestop() {
			System.out.println("The engine has stopped now.\n");
		}
		@Pointcut("execution(public void *())")
		public void myPointcut() {
			//Empty method
		}

	}


