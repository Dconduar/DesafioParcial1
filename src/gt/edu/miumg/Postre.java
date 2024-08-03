package gt.edu.miumg;

public abstract class Postre {
    protected String nombre;
    protected String tamaño;
    protected double precio;

    public Postre(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public abstract void preparar();
    public void servir() {
        System.out.println("Sirviendo el postre: " + nombre);
    }
}

