/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.practico03;

/**
 *
 * @author Mariana Ulate
 */
public class Iglesia {
    
    private String nombreIglesia;  // guardar el nombre de la iglesia
    private String nombrePastor;  // guardar el nombre del pastor de la iglesia
    private Feligreses[] feligreses;  // Arreglo para guardar los feligreses de la iglesia
    private double gananciasIglesia;  // guarda las ganancias totales de la iglesia
    private double impuestoMunicipalidad;  // guarda el impuesto para la municipalidad
    private double impuestoComedor;  // guarda el impuesto para el comedor
    private double gananciasPastor;  // guarda las ganancias del pastor

    // Constructor para inicializar la iglesia con su nombre, el pastor y el número de feligreses
    public Iglesia(String nombreIglesia, String nombrePastor, int numFeligreses) {
        this.nombreIglesia = nombreIglesia;
        this.nombrePastor = nombrePastor;
        this.feligreses = new Feligreses[numFeligreses];
        this.gananciasIglesia = 0;
        this.impuestoMunicipalidad = 0;
        this.impuestoComedor = 0;
        this.gananciasPastor = 0;
    }

    // Método para agregar un feligrés a la iglesia con su nombre, cédula y diezmo
    public void agregarFeligres(String nombre, String cedula, double diezmo) {
        // Crear un nuevo feligrés y agregarlo al arreglo de feligreses
        Feligreses feligres = new Feligreses(nombre, cedula, diezmo);
        feligreses[getNumFeligres()] = feligres;

        // Actualizar las ganancias de la iglesia y el pastor
        gananciasIglesia += diezmo;
        gananciasPastor += (diezmo * 0.70);

        // Calcular los impuestos para la municipalidad y el comedor
        impuestoMunicipalidad += (diezmo * 0.09);
        impuestoComedor += (diezmo * 0.21);
    }

    // Método para generar y mostrar un informe de la iglesia
    public void generarInforme() {
        // Mostrar información general de la iglesia y el pastor
        System.out.println("Informe de la Iglesia " + nombreIglesia);
        System.out.println("Nombre del Pastor: " + nombrePastor);
        System.out.println("Monto total de ganancias de la iglesia: " + gananciasIglesia);
        System.out.println("Monto para la municipalidad (infraestructura): " + impuestoMunicipalidad);
        System.out.println("Monto para el comedor municipal: " + impuestoComedor);
        System.out.println("Monto de ganancia para el pastor: " + gananciasPastor);

        // Mostrar personas con diezmo igual a 0
        System.out.println("Personas con diezmo igual a 0:");
        for (Feligreses feligres : feligreses) {
            if (feligres != null && feligres.getDiezmo() == 0) {
                System.out.println("Nombre: " + feligres.getNombre() + ", Cédula: " + feligres.getCedula());
            }
        }

        // Mostrar personas con diezmo mayor a 100000
        System.out.println("Personas con diezmo mayor a 100000:");
        for (Feligreses feligres : feligreses) {
            if (feligres != null && feligres.getDiezmo() > 100000) {
                System.out.println("Nombre: " + feligres.getNombre() + ", Cédula: " + feligres.getCedula());
            }
        }
    }

    // Método privado para obtener el número de feligreses registrados
    private int getNumFeligres() {
        for (int i = 0; i < feligreses.length; i++) {
            if (feligreses[i] == null) {
                return i;
            }
        }
        return feligreses.length;
    }
}

