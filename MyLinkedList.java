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
    if (index < 0 || index >= length) throw new IndexOutOfBoundsException();
    return getNthNode(index).setData(value);
  }

  public boolean contains(Integer value) {
    MyNode current = start.next();
    boolean output = false;
    for (int x = 0; x < length - 1; x++) {
      if (current.data().equals(value)) output = true;
      current = current.next();
    }
    return output;
  }

  public int indexOf(Integer value) {
    MyNode current = start.next();
    int output = -1;
    for (int x = 0; x < length - 1; x++) {
      if (current.data().equals(value)) output = x;
      current = current.next();
    }
    return output;
  }

  public void add(int index, Integer value) {
    if (index < 0 || index >= length) throw new IndexOutOfBoundsException();
    MyNode current = start;
    for (int x = 0; x < length; x++) {
      if (x==index) {
        MyNode newN = new MyNode(value, current.next(), current);
        current.setNext(newN);
        newN.next().setPrev(newN);
        current = current.next();
      }
      current = current.next();
    }
    length++;
  }

  public Integer remove(int index) {
    if (index < 0 || index >= length) throw new IndexOutOfBoundsException();
    MyNode node = getNthNode(index);
    node.prev().setNext(node.next());
    node.next().setPrev(node.prev());
    length--;
    return node.data();
  }

  public boolean remove(Integer value){
    if (!contains(value)) return false;
    remove(indexOf(value));
    return true;
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
