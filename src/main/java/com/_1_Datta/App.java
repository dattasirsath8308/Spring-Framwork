package com._1_Datta;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/_1_Datta/BeanConfig.xml");
        
        
        Player p1 = (Player) context.getBean("sobj1");
        System.out.println(p1);
        
        Player p2 = (Player) context.getBean("sobj2");
        System.out.println(p2);
        
        
        Player p3 = (Player) context.getBean("sobj3");
        System.out.println(p3);
        
        
    }
}
