package finny.vesit.spring;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class Logging {
	@Before("execution(public int accountTransaction()))")
	public void transactionBegin() {
		System.out.println("Transaction has started now.");
	}
	@AfterThrowing("execution(public int accountTransaction()))")
	public void transactionEnd() {
		System.out.println("Transaction throwed successfully.");
	}


}
