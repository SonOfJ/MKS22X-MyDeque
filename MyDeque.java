import java.util.*;
@SuppressWarnings("unchecked")
public class MyDeque<E> {
  private E[] data;
  private int size, start, end;
  public MyDeque() {
    E[] d = (E[]) new Object[10];
    data = d;
  }
  public MyDeque(int initialCapacity) {
    E[] d = (E[]) new Object[initialCapacity];
    data = d;
  }
  public int size() {
    return size;
  }
  private void resize(){
    E[] newdata = (E[])new Object[data.length * 2 + 1];

    for (int i = start; i < start + size; i++){
      newdata[i - start] = data[i % data.length];
    }

    end = size - 1;
    start = 0;
    data = newdata;

  }
  public String toString() {
    String display = "[";
    for (int i = 0; i < data.length - 1; i = i + 1) {
      if (data[i] != null) {
        display = display + data[i];
        if (data[i + 1] != null) {
          display = display + ", ";
        }
      }
    }
    display = display + "]";
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
    if (size() == data.length) {
      resize(); //Make space for that extra element.
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
  public E removeFirst() {
    if (size() == 0) {
      throw new NoSuchElementException("The array is empty.");
    }
    E hold = data[start]; //The value should be held onto because it must be returned later.
    if (size() != 1) { //More than 1 element?
      if (start == data.length - 1) { //If start is at the very end.
        start = 0; //Move it to the start.
      } else {
        start = start + 1; //Move start to the right.
      }
    }
    size = size - 1; //Size decreases due to subtraction.
    return hold; //Return old value.
  }
  public E removeLast() {
    if (size() == 0) {
      throw new NoSuchElementException("The array is empty.");
    }
    E hold = data[end]; //The value should be held onto because it must be returned later.
    if (size() != 1) { //More than 1 element?
      if (end == 0) { //If end is at the very beginning.
        end = data.length - 1; //Move it where it belongs.
      } else {
        end = end - 1; //Move end to the left.
      }
    }
    size = size - 1;
    return hold;
  }
  public E getFirst() {
    if (size() == 0) {
      throw new NoSuchElementException("There can't be a first element if the array is empty.");
    }
    return data[start];
  }
  public E getLast() {
    if (size() == 0) {
      throw new NoSuchElementException("There can't be a first element if the array is empty.");
    }
    return data[end];
  }
}
