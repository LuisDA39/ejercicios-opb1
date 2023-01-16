public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.edad = 34;
        cliente1.telefono = "1 453 2378";
        cliente1.nombre = "José Enrique López";
        cliente1.credito = 32400.00;

        System.out.println(cliente1.edad);
        System.out.println(cliente1.telefono);
        System.out.println(cliente1.nombre);
        System.out.println(cliente1.credito);

        Trabajador trabajador1 = new Trabajador();
        trabajador1.edad = 43;
        trabajador1.telefono = "1 234 5678 1231";
        trabajador1.nombre = "Luis David de la Barrera";
        trabajador1.salario = 23000.09;

        System.out.println(trabajador1.edad);
        System.out.println(trabajador1.telefono);
        System.out.println(trabajador1.nombre);
        System.out.println(trabajador1.salario);

    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}
