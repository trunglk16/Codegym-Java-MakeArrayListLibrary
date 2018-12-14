package Package;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];

    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        for (int i = this.size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
    }

    public E remove(int index) {
        E temp = null;
        if (elements[index] != null) {
            temp = (E) elements[index];

            int newsize = elements.length - 1;

            for (int i = index; i < newsize; i++) {
                elements[i] = elements[i + 1];

            }

        }

        return temp;
    }


    public int size() {
        size = elements.length;
        return size;
    }

    public void ensureCapa(int x) {
        size = x;
        elements = Arrays.copyOf(elements, size);

    }


    public void addLast(E e) {
        ensureCapa(elements.length + 1);
        elements[elements.length - 1] = e;
    }

    public void printList() {
        for (Object element : elements
        ) {
            System.out.println(element);
        }
    }

    public boolean contains(E o) {

        return this.indexOf(o)>0;
    }


    public int indexOf(E o) {
        int count = 0;

        for (int i = 0; i < size(); i++) {
            if (elements[i] == o) {
                count++;

            }
        }
        return count;

    }
    public E get(int i){
        return (E)elements[i];
    }

}
