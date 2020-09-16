package Concurrent;

class Point1 {
    String x;

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public String getZ() {
        return z;
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public void setZ(String z) {
        this.z = z;
    }

    String y;
    String z;

}

public class Main9 {
    public int[][] RotateMatrix(int[][] matrix) {
        // write code here
        reverse(matrix);
        int n1 = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1 - i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n1 - j][n1 - j];
                matrix[n1 - 1][n1 - j] = temp;
            }
        }
        return matrix;
    }

    public void reverse(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i][j];
                matrix[n - i][j] = temp;
            }
        }
    }


    public static void main(String[] args) {
    

    }
}
