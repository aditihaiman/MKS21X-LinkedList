public class Driver {
  public static void main(String[] args) {

    MyLinkedList list = new MyLinkedList();
    System.out.println(list);
    for (int x = 0; x < 10; x++) {
      list.add(x);
    }

    System.out.println(list); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    System.out.println(list.get(4)); //should print 4
    System.out.println(list.contains(8)); //true
    System.out.println(list.contains(-1)); //false
    System.out.println(list.set(0, -1)); // should print 0
    System.out.println(list);
  }


}
