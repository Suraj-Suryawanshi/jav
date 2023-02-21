package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started!!!!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//        JdbcTemplate template =context.getBean("jdbcTemplate",JdbcTemplate.class);

        StudentDao studentDao = context.getBean("studentDao",StudentDao.class );
//        
//        Student student =new Student();
//        student.setId(23);
//        student.setName("Ghajini");
//        student.setCity("Chennai");
//        
//        int result = studentDao.insert(student);
//        System.out.println("student added"+ result);
        
        //for changing-------
//        student.setName("Akki");
//        student.setCity("Delhi");
//        student.setId(23);
//        int result = studentDao.change(student);
//        System.out.println("Student changed"+ result);
        
        //for deleting--------
//        student.setId(23);
//        int result = studentDao.delete(student);
//        System.out.println("Student deleted"+result);
        
        //row Mapper getById
//        Student student1 = studentDao.getStudent(23);
//        System.out.println(student1);
        
        List<Student> students = studentDao.getAllStudents();
        for(Student s: students) {
        	System.out.println(s);
        }
        
        
//        //insert query
//        String query = "insert into student(id,name,city)values(?,?,?)";   
//        //fire query
//        int result = template.update(query,3,"Shiva","Delhi");
//        System.out.println("Number of record inserted.."+ result);
    }
}
