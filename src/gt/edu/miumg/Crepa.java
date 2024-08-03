package gt.edu.miumg;

public class Crepa extends Postre {
    private String tipoMasa;

    public Crepa(String nombre, String tamaño, double precio, String tipoMasa) {
        super(nombre, tamaño, precio);
        this.tipoMasa = tipoMasa;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando crepa de tipo masa: " + tipoMasa);
    }
}

