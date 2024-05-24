package org.khiemtran.structures.linked_list;

public class CircularSinglyLinkedList<T> {
  public static class Node<T> {
    private Node<T> next;
    private final T data;

    public Node(T data) {
      this.data = data;
      this.next = null;
    }

    public T getData() {
      return data;
    }

    public Node<T> getNext() {
      return next;
    }

    public void setNext(Node<T> next) {
      this.next = next;
    }
  }

  private Node<T> head;
  private int size;

  public Node<T> getHead() {
    return head;
  }

  public int getSize() {
    return size;
  }

  public void add(T data) {
    Node<T> newNode = new Node<>(data);
    if (head == null) {
      head = newNode;
    } else {
      Node<T> current = head;
      while (current.getNext() != head) {
        current = current.getNext();
      }
      current.setNext(newNode);
    }
    newNode.setNext(head);
    this.size++;
  }

  public void display() {
    Node<T> current = head;
    do {
      System.out.println(current.getData());
      current = current.getNext();
    } while (current != head);
  }
}
