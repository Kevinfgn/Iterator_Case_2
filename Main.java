public class Main {
    public static void main(String[] args) {
        // Prueba con un arreglo
        ListIterator<Integer> listIterator = new ListIterator<>(new Integer[]{1, 2, 3, 4, 5});
        System.out.println("Lista:");
        listIterator.printAll();

        // Prueba con una matriz
        MatrixIterator<Integer> matrixIterator = new MatrixIterator<>(new Integer[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });
        System.out.println("Matriz:");
        matrixIterator.printAll();

        // Prueba con un árbol binario
        TreeNode<Integer> root = new TreeNode<>(1);
        root.left = new TreeNode<>(2);
        root.right = new TreeNode<>(3);
        root.left.left = new TreeNode<>(4);
        root.left.right = new TreeNode<>(5);
        root.right.right = new TreeNode<>(6);

        BinaryTreeIterator<Integer> treeIterator = new BinaryTreeIterator<>(root);
        System.out.println("Árbol Binario:");
        treeIterator.printAll();
    }
}
