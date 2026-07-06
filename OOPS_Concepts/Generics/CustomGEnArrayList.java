
import java.lang.reflect.Array;
import java.util.*;

public class CustomGEnArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGEnArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        // CustomArrayList list = new CustomArrayList();
        // list.add(3);
        // list.add(5);
        // list.add(9);
        // for (int i = 0; i < 14; i++) {
        //     list.add(2 * i);
        // }
        // System.out.println(list.size());
        // System.out.println(list);
        // ArrayList<Integer> list2 = new ArrayList<>();// this<Integer> is called generics

        WildCardExample<Integer> list3 = new WildCardExample<>();
        for(int i = 0 ; i < 14; i++){
            list3.add(2*i);
        }

        System.out.println(list3);


    }
}
