public class HomeWorkTaskTwo {
    public static void main(String[] args) {
        String[][] chessDesk = new String[8][8];
        String black = "B";
        String white = "W";
        for (int i = 0; i < chessDesk.length; i++) {
            for (int j = 0; j < chessDesk[i].length; j = j + 2) {
                if (i % 2 == 0) {
                    chessDesk[i][j] = white;
                    chessDesk[i][j + 1] = black;
                } else {
                    chessDesk[i][j] = black;
                    chessDesk[i][j + 1] = white;
                }
                System.out.print(chessDesk[i][j] + " " + chessDesk[i][j + 1] + " ");
            }
            System.out.println();
        }
    }
}

