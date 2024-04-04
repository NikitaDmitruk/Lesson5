import java.util.Scanner;

public class ClassWorkTaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][][] arr = {{{1, 2}, {2, 4, 1}, {2, 1, 3, 4}}, {{2, 6, 3}, {2, 1}, {2, 3, 4, 5}}};
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               length = length + arr[i][j].length;
            }
        }
        System.out.println(length);
    }
}
