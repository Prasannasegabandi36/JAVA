public class MatrixMultiplication {
    public static int[][ ] multiplyMatrices(int[][] matrixA,int[][] matrixB){
        int[][] result = new int[3][3];
        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                result[i][j] =0;
                for( int k=0;k<3;k++){
                    result[i][j]+=matrixA[i][k]*matrixB[k][j];


                }
                
            }
        }
    return result;
    
}
public static void displayMatrix(int[][] matrix){
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(matrix[i][j]+" ");

        }
        System.out.println();
    }
    System.out.println();
}
public static void main(String args[]){
    int[][] matrixA  ={
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int[][] matrixB ={
        {9,8,7},
        {6,5,4},
        {3,2,1}

    };
    System.out.println("Matrix A :");
    displayMatrix(matrixA);
    System.out.println("Matrix B :");
    displayMatrix(matrixB);
    int[][] resultMatrix = multiplyMatrices(matrixA,matrixB);
    System.out.println("Result of Matrix multiplication:");
    displayMatrix(resultMatrix);

   }
}