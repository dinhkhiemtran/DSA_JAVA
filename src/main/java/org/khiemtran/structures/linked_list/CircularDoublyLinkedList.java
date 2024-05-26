package org.khiemtran.structures.linked_list;

public class CircularDoublyLinkedList<T> {
  public static class Node<T> {
    private Node<T> next;
    private Node<T> previous;
    private final T data;

    public Node(T data) {
      this.next = null;
      this.previous = null;
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public Node<T> getNext() {
      return next;
    }

    public Node<T> getPrevious() {
      return previous;
    }

    public void setNext(Node<T> next) {
      this.next = next;
    }

    public void setPrevious(Node<T> previous) {
      this.previous = previous;
    }
  }

  private Node<T> head;
  private Node<T> tail;
  private int size;

  public CircularDoublyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public Node<T> getHead() {
    return head;
  }

  public Node<T> getTail() {
    return tail;
  }

  public int getSize() {
    return size;
  }

  public void addLast(T data) {
    Node<T> newNode = new Node<>(data);
    if (head == null) {
      head = newNode;
    } else {
      tail.setNext(newNode);
      newNode.setPrevious(tail);
    }
    tail = newNode;
    tail.setNext(head);
    head.setPrevious(tail);
    this.size++;
  }

  public void addFirst(T data) {
    Node<T> newNode = new Node<>(data);
    if (head == null) {
      tail = newNode;
    } else {
      newNode.setNext(head);
      head.setPrevious(newNode);
    }
    head = newNode;
    head.setPrevious(tail);
    tail.setNext(head);
    this.size++;
  }

  public T removeLast() {
    T data;
    if (head == null) {
      throw new IllegalArgumentException("Linked List is empty");
    }
    if (head == tail) {
      data = tail.getData();
      head = null;
      tail = null;
    } else {
      data = tail.getData();
      tail = tail.getPrevious();
      tail.setNext(head);
      head.setPrevious(tail);
    }
    this.size--;
    return data;
  }

  public T removeHead() {
    T data;
    if (head == null) {
      throw new IllegalArgumentException("Linked List is empty");
    }
    if (head == tail) {
      data = tail.getData();
      head = null;
      tail = null;
    } else {
      data = head.getData();
      head = head.getNext();
      head.setPrevious(tail);
      tail.setNext(head);
    }
    this.size--;
    return data;
  }

  public void display() {
    Node<T> current = head;
    do {
      System.out.println(current.getData());
      current = current.getNext();
    } while (current != head);
  }
}
