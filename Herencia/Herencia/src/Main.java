public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre="Pedro";
        cliente.edad = 15;
        cliente.telefono=12345;
        cliente.credito=560;

        trabajador.nombre="Maria";
        trabajador.edad = 21;
        trabajador.telefono=6789;
        trabajador.salario=10000;

        System.out.println("Nombre cliente: " + cliente.nombre);
        System.out.println("Edad cliente: " + cliente.edad);
        System.out.println("Tel cliente: " + cliente.telefono);
        System.out.println("Credito de cliente: " + cliente.credito);

        System.out.println("      " );

        System.out.println("Nombre trabajador: " + trabajador.nombre);
        System.out.println("Edad trabajador: " + trabajador.edad);
        System.out.println("Tel trabajador: " + trabajador.telefono);
        System.out.println("Salario del trabajador:" + trabajador.salario);

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}
class Trabajador extends Persona{
    int salario;
}