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
    list = new MyLinkedList();
    for (int x = 0; x < 10; x++){
      list.add(x);
    }
    System.out.println("Current list: " + list);
    System.out.println("Get first index should print 1: " + list.get(1));
    System.out.print("Get -1th index, should print an error: ");
    try {
      list.get(-1);
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
    System.out.println();
    System.out.println();
    System.out.println("---- Testing set(index, value) ----");
    System.out.println();
    System.out.println("Current list: " + list);
    System.out.println("Set 3rd index to 10 should print 3: " + list.set(3, 10));
    System.out.println("Current list: " + list);
    System.out.print("Set -1th index, should print an error: ");
    try {
      list.set(-1, 0);
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
    for (int x = 0; x < 10; x++) {
      list.set(x, x+1);
    }
    System.out.println("Setting every index of list with a loop, should be a list of 1-10 inclusive: " + list);
    System.out.println();
    System.out.println();
    System.out.println("---- Testing contains and indexOf ----");
    System.out.println("list.contains(6) should print true: " + list.contains(6));
    System.out.println("list.contains(70) should print false: " + list.contains(70));
    System.out.println("list.indexOf(4) should print 3: " + list.indexOf(4));
    System.out.println("list.indexOf(50) should print -1: " + list.indexOf(50));







  }


}
