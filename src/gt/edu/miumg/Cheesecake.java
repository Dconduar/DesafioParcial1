package gt.edu.miumg;

public class Cheesecake extends Postre {
    private String tipoQueso;

    public Cheesecake(String nombre, String tamaño, double precio, String tipoQueso) {
        super(nombre, tamaño, precio);
        this.tipoQueso = tipoQueso;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando cheesecake de tipo queso: " + tipoQueso);
    }
}

