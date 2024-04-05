import java.util.Scanner;

public class HomeWOrkTaskWithStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива [n][m] для вывода змейкой: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    arr[i][j] = 0;
                } else if (i % 2 == 0) {
                    arr[i][j] = arr[i][j] + count;
                } else {
                    arr[i][m - 1 - j] = arr[i][m - 1 - j] + count;
                }
                count = count + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] < 10) {
                    System.out.print("  " + arr[i][j]);
                } else if (arr[i][j] < 100) {
                    System.out.print(" " + arr[i][j]);
                } else {
                    System.out.print(" **");
                }
            }
            System.out.println();
        }
    }
}
