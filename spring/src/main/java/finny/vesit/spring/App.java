package finny.vesit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      
        ApplicationContext context = new ClassPathXmlApplicationContext("confi.xml");
        AccountHolder acc= (AccountHolder) context.getBean("account");
        acc.accountTransaction();
		

//        ApplicationContext context = new ClassPathXmlApplicationContext("confi.xml");
//        car car= (car) context.getBean("car");
//       car.drive();
//       bike bike= (bike) context.getBean("bike");
//       bike.ride();
//       plane airplane= (plane) context.getBean("airplane");
//       airplane.fly();

//        ApplicationContext context = new ClassPathXmlApplicationContext("confi.xml");
//        Business business = (Business)context.getBean("business");
//        int multiple = business.multiplier();
//        System.out.println("Product is = "+multiple);


    }
}




