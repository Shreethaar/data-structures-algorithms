import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Element at (1,2): " + matrix[1][2]); // Prints 6
        matrix[0][1] = 10; // Set the value at (0,1) to 10
        System.out.println("Modified Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

