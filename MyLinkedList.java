public class MyLinkedList {
  private MyNode end, start;
  private int length;


  public MyLinkedList() {
    length = 0;
    start = new MyNode(null);
    end = new MyNode(null);
  }


  public int size() {
    return length;
  }

  public boolean add(Integer value) {
    MyNode newNode = new MyNode(value);
    if (length == 0) { //exception, if an empty list, then add inbetween start and end
      start.setNext(newNode);
      newNode.setNext(end);
      newNode.setPrev(start);
      end.setPrev(newNode);
    }
    else{ //else, add before end, after end.prev
      newNode.setPrev(end.prev());
      end.prev().setNext(newNode);
      end.setPrev(newNode);
      newNode.setNext(end);
    }
    length++;
    return true;
  }

  public String toString() {
    if (length == 0) return "[]"; //empty list exception
    String output = "[";
    MyNode current = start.next();
    while (current.data() != null) { //loops through all nodes between start and end
      output += current.data() + ", ";
      current = current.next();
    }
    return output.substring(0, output.length()-2) + "]";
  }

  public Integer get(int index) {
    if (index < 0 || index >= length) throw new IndexOutOfBoundsException();
    return getNthNode(index).data();
  }

  public Integer set(int index, Integer value) {
    // Integer output = getNthNode(index).data();
    // getNthNode(index).setData(value);
    return getNthNode(index).setData(value);
  }

  public boolean contains(Integer value) {
    boolean output = false;
    for (int x = 0; x < length; x++) {
      if (getNthNode(x).data().equals(value)) output = true;
    }
    return output;
  }

  public int indexOf(Integer value) {
    int output = -1;
    for (int x = 0; x < length; x++) {
      if (getNthNode(x).data().equals(value)) output = x;
    }
    return output;
  }

  public void add(int index, Integer value) {
    if (index < 0 || index >= length) throw new IndexOutOfBoundsException();

  }

  public Integer remove(int index) {
    if (index < 0 || index >= length) throw new IndexOutOfBoundsException();
    MyNode node = getNthNode(index);
    node.prev().setNext(node.next());
    node.next().setPrev(node.prev());
    return node.data();
  }


// -- Helper Method -- //
//linear
  private MyNode getNthNode(int index) { //private helper method to find node at an index
    MyNode current = start.next();
    MyNode output = current;
    for (int x = 0; x < length; x++) {
      if (x == index) {
        output = current;
      }
      current = current.next();
    }
    return output;
  }


}
