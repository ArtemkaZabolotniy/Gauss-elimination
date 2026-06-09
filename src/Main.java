import static java.lang.IO.*;
import static java.util.Random.*;


void main() {
    double[][] matrix = new double[4][4];
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = (double)(1.0 + Math.random() * 9.0);
        }
    }
    println("default matrix:");
    printMatrix(matrix);
    GausEllimination(matrix);
    println(" ");
    println("matrix after GausEllimination:");
    printMatrix(matrix);
}

public static void printMatrix(double[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.printf("%.0f ", matrix[i][j]);
        }
        println(" ");
    }
}

public static void GausEllimination(double[][] matrix) {
    int length = matrix.length;
    for(int i = 0; i < length -1; i++) {
        for(int j = i+1; j < length ;j++) {
            double temp;
            if(matrix[i][i] != 0) {
                temp = matrix[j][i] / matrix[i][i];
                int k = 0;
                while(k <= length -1) {
                    matrix[j][k] = matrix[j][k] - ( temp * matrix[i][k]);
                    k++;
                }
            } else {
                temp = 0.0;
                int k = 0;
                while(k <= length -1) {
                    matrix[j][k] = matrix[j][k] - ( temp * matrix[i][k]);
                    k++;
                }
            }
        }
    }
}