import java.util.Scanner;

public class Transpoze {
    public static void main(String[] args) {
        int m, n;

        Scanner k = new Scanner(System.in);
        System.out.print("Matrisin satır sayısını girin : ");
        m = k.nextInt();
        System.out.print("Matrisin sütun sayısını girin : ");
        n = k.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Matrisin elemanlarını girin");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Matirisin " + (i + 1) + ". satır " + (j + 1) + ". sütun elemanını girin: ");
                matrix[i][j] = k.nextInt();
            }
        }

        System.out.println("Matris: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.print("\n");
        }

        int transpose[][] = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrisin tersi:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j] + "\t");
            }

            System.out.print("\n");
        }
    }
}

