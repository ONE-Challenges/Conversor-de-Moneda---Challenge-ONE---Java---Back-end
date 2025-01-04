import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double valor;
        ConsultaTipoCambio consultaTipoCambio = new ConsultaTipoCambio();

        do {
            System.out.println("*******************************************");
            System.out.println("Sea Bienvenido/a al Conversor de Moneda =]");
            System.out.println("*******************************************");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida: ");
            System.out.println("*******************************************");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingresa el valor que deseas convertir: ");
                valor = scanner.nextDouble();

                try {
                    var tipoCambio = consultaTipoCambio.consultarTipoCambio();
                    double tasaConversion = 0.0;
                    double resultado;

                    switch (opcion) {
                        case 1 -> { // Dólar => Peso argentino
                            tasaConversion = consultaTipoCambio.obtenerTasa(tipoCambio, "ARS");
                            resultado = valor * tasaConversion;
                            System.out.printf("%.2f USD equivale a %.2f ARS%n", valor, resultado);
                        }
                        case 2 -> { // Peso argentino => Dólar
                            tasaConversion = consultaTipoCambio.obtenerTasa(tipoCambio, "ARS");
                            resultado = valor / tasaConversion;
                            System.out.printf("%.2f ARS equivale a %.2f USD%n", valor, resultado);
                        }
                        case 3 -> { // Dólar => Real brasileño
                            tasaConversion = consultaTipoCambio.obtenerTasa(tipoCambio, "BRL");
                            resultado = valor * tasaConversion;
                            System.out.printf("%.2f USD equivale a %.2f BRL%n", valor, resultado);
                        }
                        case 4 -> { // Real brasileño => Dólar
                            tasaConversion = consultaTipoCambio.obtenerTasa(tipoCambio, "BRL");
                            resultado = valor / tasaConversion;
                            System.out.printf("%.2f BRL equivale a %.2f USD%n", valor, resultado);
                        }
                        case 5 -> { // Dólar => Peso colombiano
                            tasaConversion = consultaTipoCambio.obtenerTasa(tipoCambio, "COP");
                            resultado = valor * tasaConversion;
                            System.out.printf("%.2f USD equivale a %.2f COP%n", valor, resultado);
                        }
                        case 6 -> { // Peso colombiano => Dólar
                            tasaConversion = consultaTipoCambio.obtenerTasa(tipoCambio, "COP");
                            resultado = valor / tasaConversion;
                            System.out.printf("%.2f COP equivale a %.2f USD%n", valor, resultado);
                        }
                    }
                } catch (Exception e) {
                    System.err.println("Error al realizar la conversión: " + e.getMessage());
                }
            } else if (opcion == 7) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }

            System.out.println();
        } while (opcion != 7);

        scanner.close();
    }
}