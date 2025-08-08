import java.util.*;

class SimpleList<T> implements Iterable<T> {

  private Object[] items = new Object[10];
  private int size = 0;

  public void add(T item) {
    items[size++] = item;
  }

  @Override
  public Iterator<T> iterator() {
    return new Iterator<T>() {
      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < size;
      }

      @Override
      @SuppressWarnings("unchecked")
      public T next() {
        return (T) items[index++];
      }

    };
  }

  public static void main(String[] args) {
    SimpleList<String> list = new SimpleList<>();

    list.add("A");
    list.add("B");
    list.add("C");

    for (String item : list) {
      System.out.println(item);
    }

  }
}