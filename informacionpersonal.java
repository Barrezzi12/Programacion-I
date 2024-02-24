import java.util.Scanner;

public class informacionpersonal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe tu nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.print("Coloca tu Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Coloca tu año de nacimiento: ");
        int año = scanner.nextInt();

        System.out.print("Cuántos hermanos tienes?: ");
        int hermanos = scanner.nextInt();

        System.out.println("\n¡Hola, " + nombre + "! esta es tu información:");
        System.out.println("Tienes: " + edad + "años");
        System.out.println("Tienes: " + hermanos + "hermanos");


        scanner.close();
    }
}