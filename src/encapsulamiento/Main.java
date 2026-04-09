package encapsulamiento;

public class Main {
    public static void main(String[] args) {

        // Persona
        Persona p = new Persona();
        p.setNombre("Juan");
        p.setEdad(-5);
        System.out.println("Persona: " + p.getNombre() + " - Edad: " + p.getEdad());

        // Producto
        Producto prod = new Producto();
        prod.setNombre("Laptop");
        prod.setPrecio(5000);
        prod.setStock(10);
        prod.vender(3);

        // CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular("Carlos");
        cuenta.setSaldo(1000);
        cuenta.setPin(1234);
        cuenta.retirar(200, 1234);
        cuenta.retirar(100, 1111);

        // Curso
        Curso curso = new Curso();
        curso.setNota1(80);
        curso.setNota2(70);
        curso.setNota3(60);
        System.out.println("Promedio: " + curso.promedio());
        System.out.println("Estado: " + curso.estado());

        // Estudiante
        Estudiante est = new Estudiante();
        est.setNombre("Ana");
        est.setPromedio(90);
        System.out.println("Es becado: " + est.esBecado());

        // Termometro
        Termometro t = new Termometro();
        t.setCelsius(25);
        System.out.println("Fahrenheit: " + t.getFahrenheit());

        // Reloj
        Reloj r = new Reloj();
        r.setHora(10);
        r.setMinuto(30);
        r.setSegundo(45);
        System.out.println("Hora: " + r.mostrarHora());

        // Contacto
        Contacto c = new Contacto();
        c.setNombre("Luis");
        c.setTelefono("12345678");
        c.setEmail("correo@mail.com");
        c.mostrarContacto();

        // Jugador
        Jugador j = new Jugador();
        j.setNombre("Player1");
        j.actualizarPuntaje(100);
        j.actualizarPuntaje(150);

        // Factura
        Factura f = new Factura();
        f.setCodigoFactura("F001");
        f.setDescripcion("Compra de teclado");
        f.setCantidad(2);
        f.setPrecioUnitario(150);
        f.mostrarFactura();
    }
}
