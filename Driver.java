public class Driver {
  public static void main(String[] args) {

    MyLinkedList list = new MyLinkedList();
    System.out.println(list);
    for (int x = 0; x < 10; x++) {
      list.add(x);
    }

    System.out.println(list);

  }
}
