
import gt.edu.miumg.*;

public class Main {
    public static void main(String[] args) {
        // Crear ingredientes
        Masa masaCrepa = new Masa("Trigo", 100);
        Relleno rellenoPastel = new Relleno("Chocolate", 200);
        Cobertura coberturaCheesecake = new Cobertura("Fresa", 150);

        // Crear postres
        Postre crepa = new Crepa("Crepa Dulce", "Extra Grande", 5.99, "Trigo");

        // Crear empleados
        Empleado empleado1 = new Empleado("Diego", "Cocinero", 1500.00);

        // Crear equipo
        Equipo horno = new Equipo("Horno", "Operativo");

        // Crear sucursal
        Sucursal sucursalParis = new Sucursal("Paris", "123 Calle Barrio San Francisco");

        // Agregar empleados, ingredientes, equipos y especialidades a la sucursal
        sucursalParis.agregarEmpleado(empleado1);
        sucursalParis.agregarIngrediente(masaCrepa);
        sucursalParis.agregarIngrediente(rellenoPastel);
        sucursalParis.agregarIngrediente(coberturaCheesecake);
        sucursalParis.agregarEquipo(horno);
        sucursalParis.agregarEspecialidad(crepa);

        // Probar métodos
        crepa.preparar();
        crepa.servir();

        empleado1.trabajar();
        empleado1.tomarOrden();

        horno.encender();
        horno.apagar();
        horno.reparar();
    }
}

