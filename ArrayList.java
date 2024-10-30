import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void imprimir(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Indice " + i + " = " + arr.get(i));
        }
    }

    static void borrar(ArrayList<String> arr, String opcion) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equalsIgnoreCase(opcion)) {
                arr.remove(opcion);
            }else{
                System.out.println("Nombre no existe");
            }
        }
    }

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        while (true) {
            System.out.println("Ingresa un nombre (al ingresar 'terminar' se dejaran de añadir nombres)");
            String nombre = Leer.nextLine();
            if (nombre.equalsIgnoreCase("terminar")) {
                break;
            }
            nombres.add(nombre);
        }

        imprimir(nombres);
        System.out.println("Desea eliminar algun dato? y=si n=no");
        String res = Leer.nextLine();
        if (res.equalsIgnoreCase("y")){
            System.out.println("Ingrese el nombre que desea eliminar");
            String opcion = Leer.nextLine();
            borrar(nombres,opcion);
            System.out.println("Este es el arreglo:");
            imprimir(nombres);
        }else{
            System.out.println("Ese es el arreglo:");
            imprimir(nombres);
        }
    }
}
