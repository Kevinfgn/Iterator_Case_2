public class ListIterator<T> implements Iterator<T> {
    private T[] collection;
    private int index = 0;

    public ListIterator(T[] collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.length;
    }

    @Override
    public T next() {
        return hasNext() ? collection[index++] : null;
    }

    @Override
    public void printAll() {
        while (hasNext()) {
            System.out.print(next() + " ");
        }
        System.out.println();
    }
}

