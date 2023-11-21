import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

interface Calculable {
    double calcularPrecioFinal();
}


abstract class Vehiculo implements Calculable {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    
    public abstract double calcularPrecioFinal();
}


class VehiculoTurismo extends Vehiculo {
    private int numPlazas;
    private double precioBase;

    public VehiculoTurismo(String marca, String modelo, int numPlazas, double precioBase) {
        super(marca, modelo);
        this.numPlazas = numPlazas;
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecioFinal() {
        if (numPlazas <= 5) {
            return precioBase;
        } else {
            return precioBase + ((numPlazas - 5) * 0.1 * precioBase);
        }
    }

    
    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}


class Furgoneta extends Vehiculo {
    private double capacidadM3;
    private double precioBase;

    public Furgoneta(String marca, String modelo, double capacidadM3, double precioBase) {
        super(marca, modelo);
        this.capacidadM3 = capacidadM3;
        this.precioBase = precioBase;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase * (0.5 * Math.cbrt(capacidadM3));
    }

    
    public double getCapacidadM3() {
        return capacidadM3;
    }

    public void setCapacidadM3(double capacidadM3) {
        this.capacidadM3 = capacidadM3;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}


class Concesionario {
    private List<Vehiculo> catalogo;

    public Concesionario() {
        this.catalogo = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        catalogo.add(vehiculo);
    }

    public void mostrarCatalogo() {
        for (Vehiculo vehiculo : catalogo) {
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Precio Final: " + vehiculo.calcularPrecioFinal());
            System.out.println("--------------");
        }
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Vehiculo vehiculo : catalogo) {
            precioTotal += vehiculo.calcularPrecioFinal();
        }
        return precioTotal;
    }

    
    
}

}




