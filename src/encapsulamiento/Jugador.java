package encapsulamiento;

public class Jugador {
    private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void actualizarPuntaje(int nuevoPuntaje) {
        if (nuevoPuntaje >= 0) {
            puntajeActual = nuevoPuntaje;

            if (nuevoPuntaje > puntajeMaximo) {
                puntajeMaximo = nuevoPuntaje;
            }
        } else {
            System.out.println("Puntaje invalido");
        }
    }
}