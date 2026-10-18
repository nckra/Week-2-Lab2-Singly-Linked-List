/**
 * MiddleNodeDemo.java
 * Tests the singly linked list and findMiddle() method.
 * Name: Sudenaz Çakır
 * Student ID: 230446030
 * Date: 2026-10-18
 */
public class MiddleNodeDemo {
    public static void main(String[] args) {
        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();

        SinglyLinkedList list1 = new SinglyLinkedList();
        for (int value = 1; value <= 5; value++) {
            list1.add(value);
        }

        System.out.println("List 1:");
        list1.display();
        Node middle1 = list1.findMiddle();
        System.out.println("Middle Node: " + (middle1 == null ? "None" : middle1.data));
        System.out.println();

        SinglyLinkedList list2 = new SinglyLinkedList();
        for (int value = 10; value <= 60; value += 10) {
            list2.add(value);
        }

        System.out.println("List 2:");
        list2.display();
        Node middle2 = list2.findMiddle();
        System.out.println("Middle Node: " + (middle2 == null ? "None" : middle2.data));
        System.out.println();
    }
}
