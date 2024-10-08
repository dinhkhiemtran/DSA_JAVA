package org.khiemtran.structures.tree;

public class Node<T> {
  private final T data;
  private Node<T> right;
  private Node<T> left;

  public Node(T data) {
    this.data = data;
    this.right = null;
    this.left = null;
  }

  public T getData() {
    return data;
  }

  public Node<T> getRight() {
    return right;
  }

  public Node<T> getLeft() {
    return left;
  }

  public void setRight(Node<T> right) {
    this.right = right;
  }

  public void setLeft(Node<T> left) {
    this.left = left;
  }
}
