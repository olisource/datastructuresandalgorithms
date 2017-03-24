package datastructuresandalgorithms.linkedlist;

/**
 * Created by arivolitirouvingadame on 3/23/17.
 */
public class LinkedList {
    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Reverse the singly linked list in-place.
     *
     * @param head - The head of the supplied linked list.
     * @return - The head of the reversed linked list.
     */
    public static Node reverse(Node head) {
        System.out.println("\n\n Node reverse(Node head)");

        if (head == null) {
            return null;
        }

        Node runner = head;
        Node predecessor = null;
        Node successor = head;

        successor = successor.next;

        if (successor == null) {
            return head;
        }

        while (successor != null) {
            runner.next = predecessor;
            predecessor = runner;
            runner = successor;
            successor = successor.next;
        }
        runner.next = predecessor;

        return runner;
    }

    /**
     * Find the middle node of the singly linked list.
     *
     * @param head - The head of the supplied linked list.
     * @return - The middle node of the singly linked list;  null if the supplied linked list is null.
     */
    public static Node findMiddleNode(Node head) {
        System.out.println("\n\n Node findMiddleNode(Node head)");

        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        fast = slow.next;

        if (fast == null) {
            return slow;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    /**
     * Find the length of the singly linked list.
     *
     * @param head - The head of the supplied linked list.
     * @return - Length of the supplied singly linked list; zero if the supplied singly linked list is null.
     */
    public static int getListLength(Node head) {
        System.out.println("\n\n int getListLength(Node head)");

        if (head == null) {
            return 0;
        }

        int count = 0;
        Node current = head;

        while (current != null) {
            current = current.next;
            count++;
        }

        return count;
    }

    /**
     * Display the singly linked list.
     * Big-Oh: O(n)
     *
     * @param head - The head of the supplied linked list.
     */
    public static void displayList(Node head) {
        System.out.println("\n\n void displayList(Node head)");

        if (head == null) {
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print(" " + current.data);
            current = current.next;
        }
    }

    /**
     * Print the following for the supplied singly linked list:
     *   1) Display the singly linked list
     *   2) Display the length of the singly linked list
     *   3) Display the middle node of the singly linked list
     *
     * @param head - The head of the supplied linked list.
     */
    public static void printList(Node head) {
        System.out.println("\n\n void printList(Node head)");

        if (head == null) {
            return;
        }

        displayList(head);

        int length = getListLength(head);
        System.out.println("\n length: " + length);

        Node middleNode = findMiddleNode(head);
        if (middleNode != null) {
            System.out.println("\n The middle node of the linked list: " + middleNode.data);
        } else {
            System.out.println("\n The middle node can not be found for the linked list");
        }
    }

    public static void main(String[] args) {
        testCase1();
    }

    public static void testCase1() {
        System.out.println("\n\n void testCase1()");

        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        Node eight = new Node(8);
        Node nine = new Node(9);
        Node ten = new Node(10);
        Node eleven = new Node(11);
        Node twelve = new Node(12);
        Node thirteen = new Node(13);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        seven.next = eight;
        eight.next = nine;
        nine.next = ten;
        ten.next = eleven;
        eleven.next = twelve;
        twelve.next = thirteen;

        Node head = one;
        printList(head);

        Node reversedList = reverse(head);
        System.out.println("\n\n Reversed list");
        printList(reversedList);
    }
}
