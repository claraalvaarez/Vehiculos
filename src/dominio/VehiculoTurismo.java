package dominio;

public class VehiculoTurismo extends Vehiculo{
        
        
        private int numeroPlazas;
    
        public VehiculoTurismo(String marca, String modelo, double precioBase, int numeroPlazas) {
            super(marca, modelo, precioBase);
            this.numeroPlazas = numeroPlazas;
        }
    
        public double calcularPrecioFinal() {
            double precioFinal = precioBase;
    
            if (numeroPlazas > 5) {
                int plazasExtra = numeroPlazas - 5;
                double porcentajeAumento = plazasExtra * 0.10;
                precioFinal += precioBase * porcentajeAumento;
            }
    
            return precioFinal;
        }
    
        public void mostrarInformacion() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Precio Base: " + precioBase + " euros");
            System.out.println("Número de Plazas: " + numeroPlazas);
            System.out.println("Precio Final: " + calcularPrecioFinal() + " euros");
        }
    
        public static void main(String[] args) {
            // Ejemplo de uso
            VehiculoTurismo vehiculo = new VehiculoTurismo("Toyota", "Camry", 10000, 7);
            vehiculo.mostrarInformacion();
        }
    }
    

    



