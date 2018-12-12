public class MyNode {
  private int data;
  private MyNode next;
  private MyNode previous;

  public MyNode(int num, MyNode nodeN, MyNode nodeP) {
    data = num;
    next = nodeN;
    previous = nodeP;
  }

  public void setData(int num) {
    data = num;
  }

  public void setNext(MyNode n) {
    next = n;
  }

  public void setPrevious(MyNode p) {
    previous = p;
  }

  public int getData() {
    return data;
  }


}
