package addmatrice.com.alnova;

public class AddMatrice {
	// Function to add matrice
    static void printMatrix(int M[][],
                            int rowSize,
                            int colSize)
    {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");
 
            System.out.println();
        }
    }
 
    // Function C store A + B
    static int[][] add(int A[][], int B[][],
                       int size)
    {
        int i, j;
        int C[][] = new int[size][size];
 
        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                C[i][j] = A[i][j] + B[i][j];
 
        return C;
    }
 
    // main 
    public static void main(String[] args)
    {
        int size = 4;
 
        // init matrice A
        int A[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 },
                      { 4, 4, 4, 4 } };
        
        // Print the result matrice A
        System.out.println("\nMatrix A:");
        printMatrix(A, size, size);
 
        // init matrice B
        int B[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 },
                      { 4, 4, 4, 4 } };
        // Print the result matrice B
        System.out.println("\nMatrix B:");
        printMatrix(B, size, size);
 
        // Add the two matrices
        int C[][] = add(A, B, size);
 
        // Print the result
        System.out.println("\nResultant Matrix:");
        printMatrix(C, size, size);
    }

}
