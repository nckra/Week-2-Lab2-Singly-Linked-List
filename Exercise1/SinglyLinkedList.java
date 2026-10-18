/**
 * SinglyLinkedList.java
 * Represents a singly linked list.
 * Name: Sudenaz Çakır
 * Student ID: 230446030
 * Date: 2026-10-18
 */
public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        int middleIndex = count / 2;
        current = head;
        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }
        return current;
    }

    public Node getHead() {
        return head;
    }
}
