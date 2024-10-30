import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar los registros (cada registro es un ArrayList de Strings)
        ArrayList<ArrayList<String>> tabla = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Desea añadir un nuevo registro? (si/no)");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("no")) {
                break;
            } else if (respuesta.equalsIgnoreCase("si")) {
                ArrayList<String> registro = new ArrayList<>();

                // Solicitar y almacenar el nombre
                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine();
                registro.add(nombre);

                // Solicitar y almacenar las calificaciones
                for (int i = 1; i <= 3; i++) {
                    System.out.print("Ingrese la Calificación " + i + ": ");
                    String calificacion = scanner.nextLine();
                    registro.add(calificacion);
                }

                // Añadir el registro a la tabla
                tabla.add(registro);
            } else {
                System.out.println("Respuesta no válida. Por favor, escriba 'si' o 'no'.");
            }
        }

        // Mostrar la tabla de registros
        System.out.println("\nTabla de Calificaciones:");
        System.out.println("Nombre\tC1\tC2\tC3");

        for (ArrayList<String> registro : tabla) {
            System.out.println(String.join("\t", registro));
        }
    }
}
