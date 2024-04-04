import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkTaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int sum = 0;
        System.out.println("Введите целые числа, которые нужно добавить к каждому элементу массива: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j] + scanner.nextInt();
                sum = sum + arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Сумма всех элементов массива равна "+ sum);
    }
}
