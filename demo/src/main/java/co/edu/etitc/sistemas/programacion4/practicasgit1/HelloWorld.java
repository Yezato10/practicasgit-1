package co.edu.etitc.sistemas.programacion4.practicasgit1;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    private String message = "¡Hola Mundo desde Spring!";

    public void printMessage() {
        System.out.println(message);
    }
}