package linkedlist.singly;

public class Main {
    public static void main(String[] args) {
     LinkedList ll = new LinkedList(1);

     System.out.println("original");
     ll.printList();

     ll.append(2);
     System.out.println("append");
     ll.printList();

     ll.prepend(0);
     System.out.println("prepend");
     ll.printList();


     ll.removeLast();
     System.out.println("remove last");
     ll.printList();

     ll.removeFirst();
     System.out.println("remove First");
     ll.printList();

     System.out.println("get index by 0");
     System.out.println(ll.get(0).value);

     System.out.println("set 1 to 2");
     ll.set(0, 2);
     ll.printList();

     System.out.println("insert 3 at index 1");
     ll.insert(1, 3);
     ll.printList();

     System.out.println("remove index 0 ");
     ll.remove(0);
     ll.printList();

     System.out.println("append more elements");
     ll.append(4);
     ll.append(5);
     ll.append(6);
     ll.prepend(2);
     ll.prepend(1);

     System.out.println("before reverse");
     ll.printList();

     System.out.println("after reverse");
     ll.reverse();
     ll.printList();

     System.out.println("========================================================");
     System.out.println("========================================================");
     System.out.println("find middle node using length");
     System.out.println(ll.findMiddleNodeUsingLength().value);

     System.out.println("find middle node without using length");
     System.out.println(ll.findMiddleNodeWithoutLength().value);

     System.out.println("has loop");
     System.out.println(ll.hasLoop());

     System.out.println("findKthNodeFromEnd");
     ll.printList();
     System.out.println(ll.findKthNodeFromEnd(3).value);
    }
}
