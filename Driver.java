public class Driver {
  public static void main(String[] args) {

    // MyLinkedList list = new MyLinkedList();
    // System.out.println(list);
    // for (int x = 0; x < 10; x++) {
    //   list.add(x);
    // }
    // Integer num = 9;
    // System.out.println(list); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    // System.out.println(list.get(4)); //should print 4
    // System.out.println(list.contains(8)); //true
    // System.out.println(list.contains(-1)); //false
    // System.out.println(list.set(0, -1)); // should print 0
    // System.out.println(list);
    // System.out.println("Removing 9th index: " + list.remove(9)); // should print 9
    // System.out.println(list);
    // list.add(9);
    // System.out.println();
    // System.out.println("Resetting list: " + list);
    // System.out.println();
    // System.out.println("Removing number 9: " + list.remove(num)); //should print true
    // System.out.println(list);


    System.out.println("---------TESTING MYLINKEDLIST ---------");
    System.out.println();

    System.out.println("---- Testing toString() / add(value) / size() ----");
    System.out.println();
    MyLinkedList list = new MyLinkedList();
    System.out.println("Empty List should print []: " + list);
    System.out.println("List size should be 0: " + list.size());
    System.out.println("Adding the value 0 should print true: " + list.add(0));
    System.out.println("List should now be [0]: " + list);
    System.out.println("List size should now be 1: " + list.size());
    for (int x = 1; x < 10; x++){
      list.add(x);
    }
    System.out.println("Adding values up to 10, list should be [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]: " + list);
    System.out.println("List size should now be 10: " + list.size());
    for (int x = 0; x < 1000; x++) {
      list.add(x);
    }
    System.out.println("Adding 1000 values to list, size should be 1010: " + list.size());
    System.out.println();
    System.out.println();
    System.out.println("---- Testing get(index) ----");
    System.out.println();
    






  }


}
