import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario los dos números
        System.out.print("Digite el dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Digite el divisor: ");
        int divisor = sc.nextInt();

        // Verificar que el divisor no sea cero
        if (divisor == 0) {
            System.out.println("Error: El divisor no puede ser cero.");
            return;
        }

        // Calcular cociente y resto usando restas sucesivas
        int cocienteEntero = 0;
        int resto = dividendo;
        while (resto >= divisor) {
            resto -= divisor;
            cocienteEntero++;
        }

        // Calcular la parte decimal con precisión de 8 decimales
        double resultadoConDecimales = cocienteEntero;
        double decimalResto = resto;
        for (int i = 0; i < 8 && decimalResto != 0; i++) {
            decimalResto *= 10;
            int parteDecimal = 0;
            while (decimalResto >= divisor) {
                decimalResto -= divisor;
                parteDecimal++;
            }
            resultadoConDecimales += parteDecimal / Math.pow(10, i + 1);
        }

        // Imprimir el resultado
        System.out.println("Cociente entero: " + cocienteEntero);
        System.out.println("Resto: " + resto);
        System.out.printf("Resultado con precisión de 8 decimales: %.8f\n", resultadoConDecimales);
    }
}
