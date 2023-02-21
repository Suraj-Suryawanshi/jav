package vesit.questions.practicalexam;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vesit.questions.practicalexam.entity.Student;
import vesit.questions.practicalexam.jdbc.StudentDao;

/**
 * Hello world!
 *
 */



public class App
{ 
    public static void main( String[] args )
    {
     
      ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      Student s1 = new Student();
      s1.setRollno(1);
      s1.setName("Suraj");
      s1.setAge(22);
      Student s2 = new Student();
      s2.setRollno(3);
      s2.setName("Nikhil");
      s2.setAge(23);
      
      
      StudentDao StudD = (StudentDao) context.getBean("studDao");
//      StudD.insert(s1);
//      StudD.delete(1);
      List<Student> s = StudD.getstudents();
      for(Student x : s)
      {
    	  System.out.println(x);
      }
    }

	
}
