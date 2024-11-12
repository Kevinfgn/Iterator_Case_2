public class MatrixIterator<T> implements Iterator<T> {
    private T[][] matrix;
    private int row = 0;
    private int col = 0;

    public MatrixIterator(T[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public boolean hasNext() {
        return row < matrix.length && col < matrix[row].length;
    }

    @Override
    public T next() {
        T value = matrix[row][col++];
        if (col >= matrix[row].length) {
            col = 0;
            row++;
        }
        return value;
    }

    @Override
    public void printAll() {
        while (hasNext()) {
            System.out.print(next() + " ");
        }
        System.out.println();
    }
}

