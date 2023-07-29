package sort;
public class Matrix {
    private double[][] matrix;
    private int aSize;
    private int bSize;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.aSize = matrix.length;
        this.bSize = matrix[0].length;
    }

    public Matrix(int rows, int columns) {
        this.matrix = new double[rows][columns];
        this.aSize = rows;
        this.bSize = columns;
    }

    public Matrix add(Matrix other) {
        if (this.aSize != other.aSize || this.bSize != other.bSize) {
            throw new IllegalArgumentException("Cannot add matrices with different dimensions");
        }

        double[][] result = new double[aSize][bSize];
        for (int i = 0; i < aSize; i++) {
            for (int j = 0; j < bSize; j++) {
                result[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }

        return new Matrix(result);
    }

    public Matrix multiply(double scalar) {
        double[][] result = new double[aSize][bSize];
        for (int i = 0; i < aSize; i++) {
            for (int j = 0; j < bSize; j++) {
                result[i][j] = this.matrix[i][j] * scalar;
            }
        }

        return new Matrix(result);
    }

    public void print() {
        for (int i = 0; i < aSize; i++) {
            for (int j = 0; j < bSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix multiply(Matrix other) {
        if (this.bSize != other.aSize) {
            throw new IllegalArgumentException("Cannot multiply matrices with incompatible dimensions");
        }

        double[][] result = new double[this.aSize][other.bSize];
        for (int i = 0; i < this.aSize; i++) {
            for (int j = 0; j < other.bSize; j++) {
                for (int k = 0; k < this.bSize; k++) {
                    result[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }

        return new Matrix(result);
    }
    public static class Main {
        public static void main(String[] args) {
            double[][] a1 = {{1, 2}, {3, 4}};
            double[][] a2 = {{5, 6}, {7, 8}};

            Matrix matrix1 = new Matrix(a1);
            Matrix matrix2 = new Matrix(a2);

            Matrix sum = matrix1.add(matrix2);
            System.out.println("Сумма:");
            sum.print();

            Matrix scalarProduct = matrix1.multiply(7);
            System.out.println("Результат умножения:");
            scalarProduct.print();

            Matrix product = matrix1.multiply(matrix2);
            System.out.println("Умножение матриц дает:");
            product.print();
        }
    }

}
