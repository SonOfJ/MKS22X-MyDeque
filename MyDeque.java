public class MyDeque<E> {
  private E[] data;
  private int size, start, end;
  public MyDeque() {
    @SuppressWarnings("unchecked")
    E[] d = (E[]) new Object[10];
    data = d;
  }
  public MyDeque(int initialCapacity) {
    @SuppressWarnings("unchecked")
    E[] d = (E[]) new Object[initialCapacity];
    data = d;
  }
  public int size() {
    return data.length;
  }
  public String toString() {
    String display = "[";
    for (int i = 0; i < data.length - 1; i = i + 1) {
      display = display + data[i] + ", ";
    }
    display = display + data[length - 1] + "]";
    return display;
  }
  public void addFirst(E element) {
    if (element == null) {
      throw new NullPointerException("Null elements are not allowed.");
    }
  public void addLast(E element){ }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }
}
