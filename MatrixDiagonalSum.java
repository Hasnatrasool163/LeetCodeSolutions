// leet code problem

// 1572. Matrix Diagonal Sum Easy

// Given a square matrix mat, return the sum of the matrix diagonals.

// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][mat.length - i - 1];
        }
        
        if (mat.length % 2 != 0) {
            
            sum -= mat[mat.length / 2][mat.length / 2];
        }
        return sum;
    }
}
