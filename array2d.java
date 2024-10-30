import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();

        // Llenar la matriz según las condiciones
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    matriz[i][j] = 0;  // Diagonal de 0,0 a 3,3 con ceros
                } else if (i + j == 3) {
                    matriz[i][j] = 9;  // Diagonal de 3,0 a 0,3 con nueves
                } else {
                    matriz[i][j] = random.nextInt(8) + 1;  // Resto con números aleatorios del 1 al 8
                }
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}