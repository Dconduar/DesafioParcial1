package gt.edu.miumg;

public class Empleado {
    private String nombre;
    private String puesto;
    private double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println(nombre + "Trabajando");
    }

    public void tomarOrden() {
        System.out.println(nombre + "Tomando Orden");
    }
}

