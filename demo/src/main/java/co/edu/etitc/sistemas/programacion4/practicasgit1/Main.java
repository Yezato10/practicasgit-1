package co.edu.etitc.sistemas.programacion4.practicasgit1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = null;
        try {
            context = new AnnotationConfigApplicationContext(AppConfig.class);
            HelloWorld hello = context.getBean(HelloWorld.class);
            hello.printMessage();
        } catch (Exception e) {
            System.err.println("Error al ejecutar la aplicación Spring:");
            e.printStackTrace();
        } finally {
            if (context != null) {
                context.close();
            }
        }
    }
}