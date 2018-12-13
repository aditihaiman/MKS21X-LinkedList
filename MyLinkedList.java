public class MyLinkedList {
  private MyNode end, start, current;
  private int size;

  public int size() {
    return size;
  }

  public boolean add(int value) {
    end.setNext(new MyNode(value));
    return true;
  }

  public String toString() {
    current = start.getNext();
    String output = "[" + start.getData();
    while (current != end) {
      output += ", " + current.getData();
      current = current.getNext();
    }
    return output + end.getData();
  }


}
