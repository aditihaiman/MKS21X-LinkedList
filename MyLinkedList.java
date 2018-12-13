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
    if (length == 0) {
      start.setNext(newNode);
      newNode.setNext(end);
      newNode.setPrev(start);
      end.setPrev(newNode);
    }
    else{
      newNode.setPrev(end.prev());
      end.prev().setNext(newNode);
      end.setPrev(newNode);
      newNode.setNext(end);
    }
    length++;
    return true;
  }

  public String toString() {
    // current = start.next();
    // String output = "[" + start.getData();
    // while (current != end) {
    //   output += ", " + current.getData();
    //   current = current.getNext();
    // }
    // return output + end.getData();
  }


}
