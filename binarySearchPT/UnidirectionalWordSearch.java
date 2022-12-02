package binarySearchPT;

public class UnidirectionalWordSearch {
    public static void main(String[] args) {
//        String[][] board = {{"H", "E", "L", "L", "O"}, {"A", "B", "C", "D", "E"}};
        String[][] board = {{"x", "z", "d", "x"}, {"p", "g", "u", "x"}, {"k", "j", "z", "d"}};
        String word = "zd";
        System.out.println(solve(board, word));
    }

    private static boolean solve(String[][] board, String word) {
        int i_Index = 0, j_Index = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char ch = word.charAt(0);
                String temp = Character.toString(ch);
                if (board[i][j].equals(temp)) {
                    if (word.length() == 1) {
                        return true;
                    }
                    i_Index = i;
                    j_Index = j;
//                    System.out.println(i_Index + " " + j_Index);
                    return checkForTheIthRows(i_Index, j_Index, board, word) ||
                            checkForTheJthCol(i_Index, j_Index, board, word);
                }
            }
        }
        return true;
    }

    private static boolean checkForTheJthCol(int i_Index, int j_Index, String[][] board, String word) {
        int k = 0, count = 0;
        for (int j = j_Index; j < board[0].length; j++) {
            char ch = word.charAt(k++);
            String temp = Character.toString(ch);
            if (!board[i_Index][j].equals(temp)) {
                return false;
            } else {
                count++;
            }
            if (count == word.length()) {
                break;
            }
        }
        return count == word.length();
    }

    public static boolean checkForTheIthRows(int i_Index, int j_Index, String[][] board, String word) {
        int k = 0, count = 0;
        for (int i = i_Index; i < board.length; i++) {
            char ch = word.charAt(k++);
            String temp = Character.toString(ch);
            if (!board[i][j_Index].equals(temp)) {
                return false;
            } else {
                count++;
            }
            if (count == word.length()) {
                break;
            }
        }
        return count == word.length();
    }
}
