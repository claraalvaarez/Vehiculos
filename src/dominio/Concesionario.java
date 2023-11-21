package dominio;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    
    private List<VehiculoTurismo> vehiculos;

    
    public Concesionario() {
        this.vehiculos = new ArrayList<>();
    }

    
    public void agregarVehiculo(VehiculoTurismo vehiculo) {
        vehiculos.add(vehiculo);
    }

    
    public void mostrarInformacionYCalcularPrecioTotal() {
        double precioTotal = 0;

        System.out.println("Información de los vehículos en el concesionario:");

        for (VehiculoTurismo vehiculo : vehiculos) {
            vehiculo.mostrarInformacion();
            System.out.println("-------------------------");
            precioTotal += vehiculo.calcularPrecioFinal();
        }

        System.out.println("Precio total de los vehículos en el concesionario: " + precioTotal + " euros");
    }

    
    public static void main(String[] args) {
        
        Concesionario concesionario = new Concesionario();

        concesionario.agregarVehiculo(new VehiculoTurismo("Toyota", "Camry", 10000, 5));
        concesionario.agregarVehiculo(new VehiculoTurismo("Ford", "Focus", 12000, 7));
        concesionario.agregarVehiculo(new VehiculoTurismo("Honda", "Civic", 15000, 4));

        concesionario.mostrarInformacionYCalcularPrecioTotal();
    }

    
    
    private List<Vehiculo> catalogo = new ArrayList<>();

    public void agregarVehiculo(Vehiculo vehiculo) {
        catalogo.add(vehiculo);
    }

    public void mostrarCatalogo() {
        for (Vehiculo vehiculo : catalogo) {
            System.out.println(vehiculo.getClass().getSimpleName() + ": Precio Final - " + vehiculo.calcularPrecioFinal() + " euros");
        }
    }

    public double obtenerPrecioTotal() {
        double precioTotal = 0;
        for (Vehiculo vehiculo : catalogo) {
            precioTotal += vehiculo.calcularPrecioFinal();
        }
        return precioTotal;
    }
}




