package Ejercicios;

public class SmartDevice {
    String marca;
    String modelo;
    String color;

    public SmartDevice() {
    }

    public SmartDevice(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }


    public static class SmartPhone extends SmartDevice {
        int ram;
        String sistema;

        public SmartPhone() {
            super();
        }

        public SmartPhone(String marca, String modelo, String color, int ram, String sistema) {
            super(marca, modelo, color);
            this.ram = ram;
            this.sistema = sistema;
        }

        @Override
        public String toString() {
            return "SmartPhone{" +
                    "ram=" + ram +
                    ", sistema='" + sistema + '\'' +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static class SmartWatch extends SmartDevice {
        double pulgadas;
        String conectividad;

        public SmartWatch() {
            super();
        }

        public SmartWatch(String marca, String modelo, String color, double pulgadas, String conectividad) {
            super(marca, modelo, color);
            this.pulgadas = pulgadas;
            this.conectividad = conectividad;
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "pulgadas=" + pulgadas +
                    ", conectividad='" + conectividad + '\'' +
                    ", marca='" + marca + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone("Apple", "iPhone 14", "Midnight Blue", 6, "iOS");

        SmartWatch smartWatch = new SmartWatch("Samsung", "Galaxy Active", "Acero", 4.1, "Bluetooth");

        System.out.println("El smartphone es: " + smartPhone + "\nEl smartwatch es: " + smartWatch);

    }
}
