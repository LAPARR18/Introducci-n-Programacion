public class Main {
    public static void main(String[] args) {
        Persona persona= new Persona();
        persona.setEdad(15);
        persona.setNombre("Pedro");
        persona.setTelefono(12345);

        int edad = persona.getEdad();
        System.out.println(edad);
        String nombre = persona.getNombre();
        System.out.println(nombre);
        int telefono = persona.getTelefono();
        System.out.println(telefono);
    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;


    // SET
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }

    //GET
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTelefono(){
        return this.telefono;
    }
}



