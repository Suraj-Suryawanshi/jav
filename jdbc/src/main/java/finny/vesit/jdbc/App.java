package finny.vesit.jdbc;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import finny.vesit.jdbc.dao.studentDao;
import finny.vesit.jdbc.enities.student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        studentDao studD = context.getBean("studDao",studentDao.class);
        
//        student s1 = new student(431,"Finny Sabu","Dombivili");
//        student s2 = new student(432,"Fibin Sabu","Dombivili");
////        int a = studD.insert(s1);
//        studD.insert(s2);
////        System.out.println("result is :- " + a);
        
       student s1 = studD.getStudent(432);       
       System.out.println(s1.toString());
    }
}
