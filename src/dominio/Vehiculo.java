package dominio;

import java.io.Serializable;

public abstract class Vehiculo implements Serializable{
    
    protected String marca;
    protected String modelo;
    protected double precioBase;

    
    public Vehiculo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    
    public abstract double calcularPrecioFinal();

    
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio Base: " + precioBase + " euros");
    }

    public interface Calculable extends Serializable {
    double calcularPrecioFinal();
}
