package co.edu.etitc.sistemas.programacion4.practicasgit1;

public class helloword {
    private String saludo;

    public void setMessage(String saludo) {
        this.saludo = saludo;
    }

    public void sayHello() {
        System.out.println("Mensaje: " + saludo);
    }
}
