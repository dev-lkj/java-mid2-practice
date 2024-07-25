package collection.list;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementData;
    private int size = 0;
    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }
    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(E e) {

    }

    @Override
    public void add(int index, E e) {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(E o) {
        return 0;
    }
}
