/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso.practico03;

/**
 *
 * @author Mariana Ulate
 */
public class Feligreses {
    
     private String nombre;
    private String cedula;
    private double diezmo;

    public Feligreses(String nombre, String cedula, double diezmo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.diezmo = diezmo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public double getDiezmo() {
        return diezmo;
    }
}
