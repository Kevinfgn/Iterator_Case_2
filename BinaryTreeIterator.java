import java.util.Stack;

public class BinaryTreeIterator<T> implements Iterator<T> {
    private Stack<TreeNode<T>> stack = new Stack<>();

    public BinaryTreeIterator(TreeNode<T> root) {
        pushLeft(root);
    }

    private void pushLeft(TreeNode<T> node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        TreeNode<T> node = stack.pop();
        T value = node.value;
        if (node.right != null) {
            pushLeft(node.right);
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
