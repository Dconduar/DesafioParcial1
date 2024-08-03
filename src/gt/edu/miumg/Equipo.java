package gt.edu.miumg;

public class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender() {
        System.out.println("Encendiendo: " + tipo);
    }

    public void apagar() {
        System.out.println("Apagando" + tipo);
    }

    public void reparar() {
        System.out.println("Reparando" + tipo);
    }
}

