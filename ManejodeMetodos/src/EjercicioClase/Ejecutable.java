/*
 *
 */
package EjercicioClase;

import java.util.Scanner;

/**
 *
 * @author dennisjimenez
 */
public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] personas = {"Ashley Cooper", "Christopher Gutierrez", 
            "Rodney Thomas"};
        double [] costo_telefono_enero = {20.2, 70.2, 50.9};
        double []costo_telefono_febrero = {10.2, 30.2, 120.9};
        String reporte = "";

        for (int i = 0; i < personas.length; i++) {
            double resultado = Consumo.obtenerValorConsumo(
                    costo_telefono_enero[i], costo_telefono_febrero[i] );
            reporte = String.format("%s%s %.2f\n", reporte, personas[i],
                    resultado);
        }
        //double resultado = Consumo.obtenerValorConsumo(total);
        System.out.println(reporte);
    }
}
