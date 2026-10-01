import java.util.Iterator;

public class AsignacionRestaurante {

    public static class Mesa {
        String codigo;
        int capacidad;
        boolean ocupada;

        public Mesa(String codigo, int capacidad) {
            this.codigo = codigo;
            this.capacidad = capacidad;
            this.ocupada = false;
        }
    }

    public static class Reservacion {
        String cliente;
        int comensales;

        public Reservacion(String cliente, int comensales) {
            this.cliente = cliente;
            this.comensales = comensales;
        }
    }