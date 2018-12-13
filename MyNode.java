public class MyNode {
  private int data;
  private MyNode next, prev;

  public MyNode(int num) {
    data = num;
  }

  public MyNode(int num, MyNode nodeN, MyNode nodeP) {
    data = num;
    next = nodeN;
    prev = nodeP;
  }

  public void setNext(MyNode n) {
    next = n;
  }

  public void setPrev(MyNode p) {
    prev = p;
  }

  public MyNode next() {
    return next;
  }

  public MyNode prev() {
    return prev;
  }

  public String toString() {
    return "" + data;
  }


}
