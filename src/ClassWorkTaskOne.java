import java.util.Arrays;
import java.util.Random;

public class ClassWorkTaskOne {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr = new int[5][3];
        int[][] arrSecond = {{1, 2, 3}, {2, 3, 1}, {5, 2, 1}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(101);
                System.out.print(arr[i][j] + " ");
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Максимальное значение в двумерном массиве arr равно " + max);
        System.out.println(Arrays.deepToString(arr));
        int maxSecond = arrSecond[0][0];
        for (int i = 0; i < arrSecond.length; i++) {
            for (int j = 0; j < arrSecond[i].length; j++) {
                System.out.print(arrSecond[i][j] + " ");
                if (maxSecond < arrSecond[i][j]) {
                    maxSecond = arrSecond[i][j];
                }
            }
        }
        System.out.println("\n" + Arrays.deepToString(arrSecond) + "\nМаксимальное значение в двумерном массиве arrSecond равно " + maxSecond);
    }
}