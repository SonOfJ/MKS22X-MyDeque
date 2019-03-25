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
    int[] bigger = new int[data.length * 2 + 1]; //Let's just assume resize increases the maximum size by 1.
    for (int i = 0; i < data.length; i = i + 1) { //Copy over elements.
      bigger[i] = data[i];
    }
    data = bigger;
    size = size + 1; //Increase overall size.
  }
  public String toString() {
    String display = "[";
    for (int i = 0; i < data.length - 1; i = i + 1) {
      if (data[i] != null) {
        display = display + data[i] + ", ";
      }
    }
    display = display + data[length - 1] + "]";
    return display;
  }
  public void addFirst(E element) {
    if (element == null) {
      throw new NullPointerException("Null elements are not allowed.");
    }
    if (size() == data.length) {
      resize(); //Make space for that extra element.
    }
    if (size() != 0) { //There's actually stuff in the array.
      if (start == 0) { //If the very first index is already occupied.
        start = data.length - 1; //Move the start index to the very end.
      } else { //Otherwise...
        start = start - 1; //Simply just move start to the left.
      }
    }
    data[start] = element; //No matter the scenario, the element must be added.
    size = size + 1; //And the size increased.
  }
  public void addLast(E element) {
    if (element == null) {
      throw new NullPointerException("Null elements are not allowed.");
    }
    if (size() != 0) { //There's actually stuff in the array.
      if (end == data.length - 1) { //If the very last index is already occupied.
        end = 0; //Move end to the start.
      } else {
        end = end + 1; //Move end to the right.
      }
    }
    data[end] = element; //Add the element.
    size = size + 1;
  }
  public E removeFirst(){ }
  public E removeLast(){ }
  public E getFirst(){ }
  public E getLast(){ }
}
