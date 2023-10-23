/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class AceitunerosMalaga {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        final double PRECIO_INICIAL = 2.45, G_PIC = 0.3, F_PIC = 0.2,
                F_ALO = 0.3, G_ALO = 0.15, F_HOJ = 0.05, G_HOJ = 0.15;
        String tamaño;
        double resultado;

        System.out.println("""
                            ¿Qué tipo de aceitunas vendes?: 
                            1º Picual
                            2º Aloreña 
                            3º Hojiblanca
                             """);
        String opcion = teclado.nextLine();

        switch (opcion) {
            case "1", "picual", "Picual" -> {
                System.out.println("¿Cuantos kilos de aceitunas vas ha entregar: ?");
                int kAceit = teclado.nextInt();
                teclado.nextLine();
                System.out.println("¿Son gruesas o finas: ?");
                tamaño = teclado.nextLine();
                switch (tamaño) {
                    case "1", "gruesas" -> {
                        resultado = (kAceit * PRECIO_INICIAL) * G_PIC;
                        System.out.printf("El precio de las aceitunas "
                                + "gruesas es: %.2f", resultado);
                    }
                    case "2", "finas" -> {
                        resultado = (kAceit * PRECIO_INICIAL) * F_PIC;
                        System.out.printf("El precio de las aceitunas "
                                + "finas es: %.2f", resultado);
                    }
                    default -> {
                        System.out.println("Esa no es una de las opciones");
                    }
                }
            }
            case "2", "Aloreña", "aloreña" -> {
                System.out.println("¿Cuantos kilos de aceitunas vas ha entregar: ?");
                int kAceit = teclado.nextInt();
                teclado.nextLine();
                System.out.println("¿Son gruesas o finas: ?");
                tamaño = teclado.nextLine();
                switch (tamaño) {
                    case "1", "gruesas" -> {
                        resultado = (kAceit * PRECIO_INICIAL) / G_ALO;
                        System.out.printf("El precio de las aceitunas "
                                + "gruesas es: %.2f", resultado);
                    }
                    case "2", "finas" -> {
                        resultado = (kAceit * PRECIO_INICIAL) / F_ALO;
                        System.out.printf("El precio de las aceitunas "
                                + "finas es: %.2f", resultado);
                    }
                    default -> {
                        System.out.println("Esa no es una de las opciones");
                    }
                }
            }
            case "3", "Hojiclanca", "hojiblanca" -> {
                System.out.println("¿Cuantos kilos de aceitunas vas ha entregar: ?");
                int kAceit = teclado.nextInt();
                teclado.nextLine();
                System.out.println("¿Son gruesas o finas: ?");
                tamaño = teclado.nextLine();
                switch (tamaño) {
                    case "1", "gruesas" -> {
                        resultado = (kAceit * PRECIO_INICIAL) * G_HOJ;
                        System.out.printf("El precio de las aceitunas "
                                + "gruesas es: %.2f", resultado);
                    }
                    case "2", "finas" -> {
                        resultado = (kAceit * PRECIO_INICIAL) / F_HOJ;
                        System.out.printf("El precio de las aceitunas "
                                + "finas es: %.2f", resultado);
                    }
                    default -> {
                        System.out.println("Esa no es una de las opciones");
                    }
                }
            }
            default -> {
                System.out.println("Error ");
            }
        }

    }
}
