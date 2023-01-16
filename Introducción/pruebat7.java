public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println(coche.puertas);
        System.out.println(coche.vmax);
        System.out.println(coche.vactual);

        Coche coche2 = new Coche(7, 95);
        System.out.println(coche2.puertas);
        System.out.println(coche2.vmax);
        System.out.println(coche2.vactual);
    }
}

class Coche {
    int puertas;
    int vmax;
    float vactual;

    public Coche() {
        puertas = 4;
        vmax = 220;
        System.out.println("Constructor sin nada");
    }

    public Coche(int puertas, int vmax) {
        this.puertas = puertas;
        this.vmax = vmax;
        System.out.println("Constructor CON PARÁMETROS");
    }
}
