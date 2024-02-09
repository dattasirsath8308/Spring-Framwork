package com._2_Injecting_Collection;

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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/_2_Injecting_Collection/BeanConfig.xml");
        JavaCollection jc = context.getBean(JavaCollection.class);
        
        
//        List
        System.out.println(jc.getAddressList());
        
//        Set
        System.out.println(jc.getAddressSet());
        
//        Map
        System.out.println(jc.getAddressMap());
        System.out.println(jc.getAddressMap().get("2"));
        
        
//        property
        System.out.println(jc.getAddressProp());

                
    }
}
