import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double valor;
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

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado: Dólar => Peso argentino");
                    System.out.println("Ingresa el valor que deseas convertir:");
                    valor = scanner.nextDouble();
                    break;
                case 2:
                    System.out.println("Has seleccionado: Peso argentino => Dólar");
                    System.out.println("Ingresa el valor que deseas convertir:");
                    valor = scanner.nextDouble();
                    break;
                case 3:
                    System.out.println("Has seleccionado: Dólar => Real brasileño");
                    System.out.println("Ingresa el valor que deseas convertir:");
                    valor = scanner.nextDouble();
                    break;
                case 4:
                    System.out.println("Has seleccionado: Real brasileño => Dólar");
                    System.out.println("Ingresa el valor que deseas convertir:");
                    valor = scanner.nextDouble();
                    break;
                case 5:
                    System.out.println("Has seleccionado: Dólar => Peso colombiano");
                    System.out.println("Ingresa el valor que deseas convertir:");
                    valor = scanner.nextDouble();
                    break;
                case 6:
                    System.out.println("Has seleccionado: Peso colombiano => Dólar");
                    System.out.println("Ingresa el valor que deseas convertir:");
                    valor = scanner.nextDouble();
                    break;
                case 7:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.out.println("Ingresa el valor que deseas convertir:");
                    valor = scanner.nextDouble();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    System.out.println("Ingresa el valor que deseas convertir:");
                    valor = scanner.nextDouble();
            }

            System.out.println();

        } while (opcion != 7);

        scanner.close();
    }
}
