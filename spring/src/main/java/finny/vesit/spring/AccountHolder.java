package finny.vesit.spring;
import java.util.*;
import java.lang.ArithmeticException;

public class AccountHolder {
	public int transaction_number;
	public int getTransaction_number() {
		return transaction_number;
	}
	public void setTransaction_number(int transaction_number) {
		this.transaction_number = transaction_number;
	}
	public int accountTransaction() {
		try {
			int i = 10/0;
			System.out.println("Transaction is in the process...");
			return i;
		}catch(ArithmeticException e)
		{
			throw e;
		}finally {
		      System.out.println("The 'try catch' is finished.");
	    }
		
		
	}

}
