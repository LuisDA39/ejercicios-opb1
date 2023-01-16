public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(33);
        persona1.setNombre("José Luis");
        persona1.setTelefono("449 288 5806");

        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Telefono: " + persona1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    // Setters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // Getters
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

}
