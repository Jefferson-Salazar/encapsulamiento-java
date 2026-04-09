package encapsulamiento;

public class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            this.edad = 0;
            System.out.println("Edad no válida");
        } else {
            this.edad = edad;
        }
    }
}