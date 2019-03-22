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
  private void resize() {
    int[] bigger = new int[data.length + 1]; //Let's just assume resize increases the maximum size by 1.
    for (int i = 0; i < data.length; i = i + 1) { //Copy over elements.
      bigger[i] = data[i];
    }
    data = bigger;
    size = size + 1; //Increase overall size.
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
    if (start == 0) { //If the very first index is already occupied.
      start =
    }
  public void addLast(E element){ }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }
}
