package com.JDBC_Configuration_Without_XML;

import java.awt.Container;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com._1_JDBC_withXML.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/MainPackge/Beans.xml");
        
      ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
       
        
        StudentDAOImpl dao = context.getBean(StudentDAOImpl.class);
//        StudentDAOImpl dao = context.getBean("studentDAOImpl",StudentDAOImpl.class);
        
        
//        System.out.println("------Records Creation--------" );
//        dao.Insert("Rohit", 11);
//        dao.Insert("Virat", 2);
//        dao.Insert("Bumrah", 15);
//       
        
        System.out.println("\n\n----Listing Record By ID  -----" );
        Student student = dao.getStudent(11);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
 
        
        System.out.println("\n\n");
        
        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = dao.listStudents();
        
        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
         }
        
        System.out.println("\n\n");

        System.out.println("----Updating Record By ID  -----" );
        int s_id = 11;
        int age = 21 ;
        dao.update(s_id , age);
        System.out.println("Age is Updated to "+age +" of "+student.getName());

        System.out.println("\n\n");

        
        System.out.println("----Updating All name , age  Record By ID  -----" );
        Student s = new Student();
        s.setId(15);
        s.setName("Gotya");
        s.setAge(24);
        dao.updateAllData(s);
        System.out.println("Updated all deatails of "+s.getId());

        
        System.out.println("\n\n");

        
        System.out.println("----Deleting Record By ID  -----" );
        int id = 14 ;
        dao.delete(id);
        System.out.println("Delete "+id +" of "+student.getName());


        
    }
}
