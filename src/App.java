import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Saludos! Este es el menú de");
        System.out.println("la máquina de bebidas. Elige una opción:");
        System.out.println("1 - Café");
        System.out.println("2 - Mate");
        System.out.println("3 - Gaseosa");
        System.out.println("4 - Vino");
        System.out.println("5 - Falopa");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
            System.out.println("Elegiste el café");
            break;
            case 2:
            System.out.println("Elegiste el mate");
            break;
            case 3:
            System.out.println("Elegiste la gaseosa");
            break;
            case 4:
            System.out.println("Elegiste el vino");
            break;
            case 5:
            System.out.println("Elegiste la memeeeeeeee");
            break;
            default:
            System.out.println("Opción no valida, la recomendación de la casa es la 5.");
            break;
        }
        System.out.println("Disfrute de su elección, muchas gracias.");
        scanner.close();
    }
}
