/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author edu
 */
public class AceitunasMalagaRefactor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        final double PRECIO_INICIAL = 2.45, G_PIC = 0.3, F_PIC = 0.2,
                F_ALO = 0.3, G_ALO = 0.15, F_HOJ = 0.05, G_HOJ = 0.15;
        String tamaño, repetirProg;
        int opcion = 0, kAceit = 0;
        double resultado;
        boolean operacionCorrecta = true;
        do {
            do {
                System.out.print(""" 
                            1º Picual
                            2º Aloreña 
                            3º Hojiblanca
                            ¿Qué tipo de aceitunas vendes: ?
                             """);
                try {
                    opcion = teclado.nextInt();
                    operacionCorrecta = false;
                } catch (InputMismatchException ime) {
                    System.out.println("Debes de introducir uno de los datos "
                            + "del menu (1 - 2 - 3)");
                    teclado.nextLine();
                }
            } while (operacionCorrecta || (opcion < 1 || opcion > 3));
            switch (opcion) {
                case 1 -> {
                    do {
                        System.out.println("¿Cuantos kilos de aceitunas vas "
                                + "ha entregar: ?");
                        try {
                            kAceit = teclado.nextInt();
                            operacionCorrecta = false;
                        } catch (InputMismatchException ime) {
                            System.out.println("Introduce los datos correctos ");
                            teclado.nextLine();
                        }
                    } while (operacionCorrecta || kAceit < 100);
                    teclado.nextLine();
                    System.out.println("¿Son gruesas o finas: ?");
                    tamaño = teclado.nextLine();
                    switch (tamaño) {
                        case "1", "gruesas" -> {
                            resultado = (kAceit * PRECIO_INICIAL) * G_PIC;
                            System.out.printf("El precio de las aceitunas "
                                    + "gruesas es: %.2f\n", resultado);
                        }
                        case "2", "finas" -> {
                            resultado = (kAceit * PRECIO_INICIAL) * F_PIC;
                            System.out.printf("El precio de las aceitunas "
                                    + "finas es: %.2f\n", resultado);
                        }
                        default -> {
                            System.out.println("Esa no es una de las opciones\n");
                        }
                    }
                }
                case 2 -> {
                    do {
                        System.out.println("¿Cuantos kilos de aceitunas vas "
                                + "ha entregar: ?");
                        try {
                            kAceit = teclado.nextInt();
                            operacionCorrecta = false;
                        } catch (InputMismatchException ime) {
                            System.out.println("Introduce los datos correctos ");
                            teclado.nextLine();
                        }
                    } while (operacionCorrecta || kAceit < 100);
                    teclado.nextLine();
                    System.out.println("¿Son gruesas o finas: ?");
                    tamaño = teclado.nextLine();
                    switch (tamaño) {
                        case "1", "gruesas" -> {
                            resultado = (kAceit * PRECIO_INICIAL) / G_ALO;
                            System.out.printf("El precio de las aceitunas "
                                    + "gruesas es: %.2f\n", resultado);
                        }
                        case "2", "finas" -> {
                            resultado = (kAceit * PRECIO_INICIAL) / F_ALO;
                            System.out.printf("El precio de las aceitunas "
                                    + "finas es: %.2f\n", resultado);
                        }
                        default -> {
                            System.out.println("Esa no es una de las opciones\n");
                        }
                    }
                }
                case 3 -> {
                    do {
                        System.out.println("¿Cuantos kilos de aceitunas vas "
                                + "ha entregar: ?");
                        try {
                            kAceit = teclado.nextInt();
                            operacionCorrecta = false;
                        } catch (InputMismatchException ime) {
                            System.out.println("Introduce los datos correctos ");
                            teclado.nextLine();
                        }
                    } while (operacionCorrecta || kAceit < 100);
                    teclado.nextLine();
                    System.out.println("¿Son gruesas o finas: ?");
                    tamaño = teclado.nextLine();
                    switch (tamaño) {
                        case "1", "gruesas" -> {
                            resultado = (kAceit * PRECIO_INICIAL) * G_HOJ;
                            System.out.printf("El precio de las aceitunas "
                                    + "gruesas es: %.2f\n", resultado);
                        }
                        case "2", "finas" -> {
                            resultado = (kAceit * PRECIO_INICIAL) / F_HOJ;
                            System.out.printf("El precio de las aceitunas "
                                    + "finas es: %.2f\n", resultado);
                        }
                        default -> {
                            System.out.println("Esa no es una de las opciones\n");
                        }
                    }
                }
            }
            System.out.println("¿Hay mas alguien mas en la cola de la almazara"
                    + " para entrega más aceitunas? ");
            repetirProg = teclado.nextLine();
        } while (!(repetirProg.equalsIgnoreCase("no")));
    }

}
