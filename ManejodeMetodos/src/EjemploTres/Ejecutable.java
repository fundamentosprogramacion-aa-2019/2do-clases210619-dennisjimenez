/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploTres;

/**
 *
 * @author Salas
 */
public class Ejecutable {
    
    public static void main(String[] args) {
        int []notas = {10, 12, 20, 18};
        int suma = Operacion.obtenerSuma(notas);
        System.out.println(suma);
    }
}