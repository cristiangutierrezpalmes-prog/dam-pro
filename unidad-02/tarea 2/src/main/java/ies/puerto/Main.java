package ies.puerto;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        System.out.println("===================");
        System.out.println("CONVERSOR DAM-PRO");
        System.out.println("===================");
        System.out.println("Introduce tu nombre");
        String nombre = teclado.nextLine();

        while (opcion != 4) {
            System.out.println("Bienvenid@," + nombre);
            System.out.println("Opción 1: KilometrosAMetros");
            System.out.println("Opción 2: MetrosACentimetros");
            System.out.println("Opción 3: KilometrosAMillas");
            System.out.println("Opción 4: Salir");
        }
    }
    /**
     * @param numerokilometro
     * @return
     */
    static float KilometroAMetro(float numerokilometro) {return numerokilometro*1000;}

    /**
     * @param numerometro
     * @return
     */
    static float metroacentimetro(float numerometro) {return numerometro*100;}

    /**
     * @param numerokilometro
     * @return
     */
    static float kilometroamilla(float numerokilometro) {return numerokilometro * 0.621371;}
}

