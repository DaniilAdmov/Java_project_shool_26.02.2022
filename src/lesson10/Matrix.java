package lesson10;

import java.util.Arrays;

public class Matrix implements IMatrix {

    private double[][] matrix;


    public Matrix(int rows, int cols) {
        matrix = new double[rows][cols];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }


    @Override
    public int getRows() {
        return matrix.length;
    }

    @Override
    public int getColumns() {
        return matrix[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if ((rowIndex >= this.getRows()) || rowIndex < 0) {
            System.out.println("Не верный индекс строки!!!- " + rowIndex);
            return -1;
        }
        if ((colIndex >= this.getColumns()) || colIndex < 0) {
            System.out.println("Не верный индекс колонки!!!- " + colIndex);
            return -1;
        }
        return matrix[rowIndex][colIndex];
    }

    @Override
    public double setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if ((rowIndex >= this.getRows()) || rowIndex < 0) {
            System.out.println("Не верный индекс строки!!!  " + rowIndex);
            return -1;
        }
        if ((colIndex >= this.getColumns()) || colIndex < 0) {
            System.out.println("Не верный индекс колонки!!!-" + colIndex);
            return -1;
        }
        return matrix[rowIndex][colIndex] = value;
    }


    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {

        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Кол-во строк не совподает!!!");
            return null;
        }
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Кол-во колонок не совподает!!!");
            return null;
        }
        Matrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));

            }
        }
        return null;
    }


    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Кол-во строк не совподает!!!");
            return null;
        }
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Кол-во колонок не совподает!!!");
            return null;
        }
        Matrix result = new Matrix(otherMatrix.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return null;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Кол-во строк не совподает!!!");
            return null;
        }
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Кол-во колонок не совподает!!!");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());
        double summa = 0;
        for (int k = 0; k < this.getRows(); k++) {
            summa = 0;
            for (int i = 0; i < this.getRows(); i++) {
                summa = 0;
                for (int j = 0; j < this.getRows(); j++) {
                    {
                        summa = this.getValueAt(k, j) * otherMatrix.getValueAt(j, i) + summa;
                        result.setValueAt(k, i, summa);
                    }
                }
            }
        }
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getRows(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return null;
    }

    @Override
    public IMatrix transpose() {
        Matrix result = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return null;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() {
        double result = 0;
        if (this.getColumns() == 2 || this.getRows() == 2) {
            result = (this.getValueAt(0, 0) * this.getValueAt(1, 1)) - (this.getValueAt(0, 1) * this.getValueAt(1, 0));
            if (this.getColumns() == 3 || this.getRows() == 3) {
                result = (this.getValueAt(0, 0) * this.getValueAt(1, 1) * this.getValueAt(2, 2)) +
                        (this.getValueAt(0, 1) * this.getValueAt(1, 2) * this.getValueAt(2, 0))
                        + (this.getValueAt(0, 2) * this.getValueAt(1, 0) * this.getValueAt(2, 1))
                        - (this.getValueAt(0, 0) * this.getValueAt(1, 2) * this.getValueAt(2, 1))
                        - (this.getValueAt(0, 1) * this.getValueAt(1, 0) * this.getValueAt(2, 2))
                        - (this.getValueAt(0, 2) * this.getValueAt(1, 1) * this.getValueAt(2, 0));
                System.out.println(result);


            }

        }
        return result;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getValueAt(i, j) != 0) {
                    System.out.println("Матрица не нулевая!!");
                }
            }
        }
        System.out.println("Матрица нулевая");
        return false;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getValueAt(i, j) == 1 && i == j) {
                } else if
                (this.getValueAt(i, j) == 0 && j != i) {
                } else {
                    System.out.println("Матрица не единичная");
                    return false;
                }
            }
        }
        System.out.println("Матрица единичная");
        return false;
    }

    @Override
    public boolean isSquareMatrix() {
        if (this.getColumns() != this.getRows()) {
            System.out.println("Матрица не является квадратной");
        } else if
        (this.getColumns() == this.getRows()) {
            System.out.println("Матрица квадратная");
        }
        return false;
    }

    @Override
    public void printToConsole() {

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(getValueAt(i, j));
            }
            System.out.println();
        }
    }

}

