import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ejercicios {

    public static String reverse(String texto) {
        StringBuilder nuevotexto = new StringBuilder(texto);
        texto = nuevotexto.reverse().toString();

        return texto;
    }

    public static int divideporCero(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        // Ejercicio 0
        System.out.println(reverse("Holaaa"));

        // Ejercicio 1
        String[] Array = {"hola", "si", "no", "adios"};
        for (String elemento: Array) { System.out.print(elemento + " "); }

        // Ejercicio 2
        int[] Array1 = {1, 2, 7, 23, 48, 56};
        for (int elemento : Array1) { System.out.print(elemento + " "); }

        // Ejercicio 3
        Vector<Double> vector = new Vector<>();
        vector.add(2.3);
        vector.add(5.5);
        vector.add(7.9);
        vector.add(9.2);
        vector.add(4.8);
        vector.remove(2);
        vector.remove(3);
        System.out.println(vector);

        // Ejercicio 4: El limite del vector se duplica y desperdicia memoria

        // Ejercicio 5
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Holaaa");
        arrayList.add("Adiosss");
        arrayList.add("Siiii");
        arrayList.add("Nooooo");

        LinkedList<String> duplicado = new LinkedList<>(arrayList);

        for (int i = 0; i < duplicado.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
            System.out.println(duplicado.get(i));
        }

        // Ejercicio 6
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
                arrayList1.add(i);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList1.get(i) % 2 == 0) {
                arrayList1.remove(i);
            }
        }
        System.out.println(arrayList1);

        // Ejercicio 7
        try {
            System.out.println("Resultado: " + divideporCero(2, 0));
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de codigo");
        }

        // Ejercicio 8
        try {
            InputStream in = new FileInputStream("copia.txt");
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("pinga");
            out.write(datos);
            out.close();

        } catch (Exception e){
            System.out.println("Error");
        }

    }
}
