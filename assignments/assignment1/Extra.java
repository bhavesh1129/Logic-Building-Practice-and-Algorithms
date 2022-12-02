package assignments.assignment1;

public class Extra {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);

        int row1 = 2;
        int col1 = 3;
        int[][] matrix1 = {{1, 2, 3}, {5, 7, 9}};
        int row2 = 2;
        int col2 = 4;
        int[][] matrix2 = {{4, 6, 7, 8}, {9, 5, 4, 3}};
        int[][] result = matrixMulti(row1, col1, matrix1, row2, col2, matrix2);

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
//        String str = "Hello -5LOL6";
//        sol(str);
    }

    private static void sol(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.toCharArray().length; i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                char ch = (char) ((int) str.charAt(i) + 32);
                sb.append(ch);
            } else if (Character.isLowerCase(str.charAt(i))) {
                char ch = (char) ((int) str.charAt(i) - 32);
                sb.append(ch);
            } else if (Character.isDigit(str.charAt(i))) {
                while (str.charAt(i) != ' ') {
                    int storeFirstDig = str.charAt(i);

                }
            } else if (str.charAt(i) >= 33 && str.charAt(i) <= 47) {
                sb.append(str.charAt(i));
            } else {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }

    private static int[][] matrixMulti(int row1, int col1, int[][] A, int row2, int col2, int[][] B) {
        int i, j, k;
        if (row2 != col1) {
            return nullMat(row1, col2);
        }

        int C[][] = new int[row1][col2];

        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        printMatrix(C, row1, col2);
        return C;
    }

    private static int[][] nullMat(int row1, int col2) {
        int[][] nullMat = new int[row1][col2];
        for (int x = 0; x < row1; x++) {
            for (int z = 0; z < col2; z++) {
                nullMat[x][z] = 0;
            }
        }
        return nullMat;
    }

    private static void printMatrix(int res[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
