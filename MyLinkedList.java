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


}
