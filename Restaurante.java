package Alejandro;

public class Restaurante {
    private static final double PAPAS_POR_PERSONA = 0.3333;
    private static final double CHOCOS_POR_PERSONA = 0.5;
    private int cantidadPapas;
    private int cantidadChocos;

    public Restaurante(int cantidadPapas, int cantidadChocos) {
        this.cantidadPapas = cantidadPapas;
        this.cantidadChocos = cantidadChocos;
    }

    public void addChocos(int x) {
        this.cantidadChocos += x;
    }

    public void addPapas(int x) {
        this.cantidadPapas += x;
    }

    public int getComensales() {
        int clientesPapas = (int) (this.cantidadPapas / PAPAS_POR_PERSONA);
        int clientesChocos = (int) (this.cantidadChocos / CHOCOS_POR_PERSONA);

        return Math.min(clientesPapas, clientesChocos);
    }

    public void showChocos() {
        System.out.println("El restaurante tiene " + this.cantidadChocos + " kilos de chocos.");
    }

    public void showPapas() {
        System.out.println("El restaurante tiene " + this.cantidadPapas + " kilos de papas.");
    }

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante(10, 6);

        restaurante.showPapas();
        restaurante.showChocos();

        restaurante.addPapas(2);
        restaurante.addChocos(1);

        System.out.println("El restaurante puede atender a " + restaurante.getComensales() + " clientes.");
    }
}

