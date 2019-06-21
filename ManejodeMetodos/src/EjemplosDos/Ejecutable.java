/*
 *Ejecutable
 */
package EjemplosDos;

import java.util.Scanner;

/**
 *
 * @author dennisjimenez
 */
public class Ejecutable {

    public static void main(String[] args) {

        /*String nombreCiudad = "Arenillas";
    boolean resultado = Operacion.comprobarCadena(nombreCiudad);
        System.out.printf("%s\n", resultado);*/
        Scanner entrada = new Scanner(System.in);
        int limite = 5;
        int contador = 1;
        String ciudad = "";
        while (contador <= limite) {
            System.out.println("Ingrese una ciudad");
            ciudad = entrada.nextLine();
            boolean resultado = Operacion.comprobarCadena(ciudad);
            if (resultado == true) {
                System.out.printf("%s\n", ciudad);
                contador = contador + 1;
            } else {
                System.out.println("Valor ingresado fuera de rango");
            }
        }
    }
}
