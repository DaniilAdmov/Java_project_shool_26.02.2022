package lesson10;

public class Main1 {
    public static void main(String[] args) {

        double[][] nums1 = {{1, 0, 0},
                            {0, 1, 0},
                            {0, 0, 1},
                            {0, 0, 0}};

        double[][] nums2 = {{1, 1, 3},
                            {1, 2, 4},
                            {2, 5, 4}};


        Matrix matrix1 = new Matrix(nums1);
        Matrix matrix2 = new Matrix(nums2);


//        System.out.println(matrix1.getRows());
//        System.out.println(matrix1.getColumns());
//
//        System.out.println(matrix1.getValueAt(2, 1));
//        System.out.println(matrix2.getValueAt(1, 0));
//
//        IMatrix resulAdd = matrix1.add(matrix2);
//
//        IMatrix resulSub = matrix1.sub(matrix2);
//
//        IMatrix resultMul1 = matrix1.mul(matrix2);
//
//        IMatrix resultMul2 = matrix1.mul(2);
//
//        IMatrix resultTranspose = matrix1.transpose();
//
//        matrix1.fillMatrix(2);
//        matrix1.determinant();
//        matrix1.isIdentityMatrix();
        matrix1.isSquareMatrix();
        matrix1.printToConsole();
    }
}
