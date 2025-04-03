package co.edu.etitc.sistemas.programacion4.practicasgit1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            

            helloword hello = (helloword) context.getBean("helloBean");
            
            hello.sayHello();
            
        } catch (Exception e) {
            System.err.println("Error al ejecutar la aplicación Spring:");
            e.printStackTrace();
        }
    }
}