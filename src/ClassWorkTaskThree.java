public class ClassWorkTaskThree {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 4}, {1, 5, 2}, {6, 2, 5}};
        int sum = 0;
        int sumReverse = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i][i]+sum;
            sumReverse = sumReverse + arr[i][arr.length-1-i];
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sum+"\n"+sumReverse);
    }
}
