/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso.practico03;
import java.util.Scanner;

/**
 *
 * @author Mariana Ulate
 */
public class CasoPractico03 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la iglesia: ");
        String nombreIglesia = scanner.nextLine();
        System.out.print("Ingrese el nombre del pastor: ");
        String nombrePastor = scanner.nextLine();
        System.out.print("Ingrese la cantidad de feligreses: ");
        int numFeligreses = scanner.nextInt();

        Iglesia iglesia = new Iglesia(nombreIglesia, nombrePastor, numFeligreses);

        for (int i = 0; i < numFeligreses; i++) {
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Ingrese los datos del feligrés #" + (i + 1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Diezmo: ");
            double diezmo = scanner.nextDouble();

            iglesia.agregarFeligres(nombre, cedula, diezmo);
        }

        iglesia.generarInforme();

        scanner.close();
    }
}