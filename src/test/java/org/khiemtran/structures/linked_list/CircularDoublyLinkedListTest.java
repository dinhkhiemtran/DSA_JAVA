package org.khiemtran.structures.linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class CircularDoublyLinkedListTest {
  private final CircularDoublyLinkedList<Object> linkedList = new CircularDoublyLinkedList<>();

  @Test
  public void addOnlyElement() {
    Assertions.assertEquals(0, linkedList.getSize());
    Assertions.assertNull(linkedList.getHead());
    Assertions.assertNull(linkedList.getTail());
    linkedList.addLast(1);
    Assertions.assertEquals(1, linkedList.getHead().getData());
    Assertions.assertEquals(1, linkedList.getSize());
  }

  @Test
  public void addLastOnlyElement() {
    Assertions.assertEquals(0, linkedList.getSize());
    Assertions.assertNull(linkedList.getHead());
    Assertions.assertNull(linkedList.getTail());
    linkedList.addFirst(1);
    Assertions.assertEquals(1, linkedList.getHead().getData());
    Assertions.assertEquals(1, linkedList.getSize());
  }

  @Test
  public void addElements() {
    linkedList.addLast(1);
    linkedList.addLast("test");
    linkedList.addLast('t');
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    linkedList.addLast(numbers);
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "1");
    map.put(2, "2");
    map.put(3, "3");
    linkedList.addLast(map);
    Assertions.assertEquals(5, linkedList.getSize());
    Assertions.assertEquals(1, linkedList.getHead().getData());
    Assertions.assertEquals(map, linkedList.getTail().getData());
    Assertions.assertEquals(numbers, linkedList.getTail().getPrevious().getData());
    Assertions.assertEquals("test", linkedList.getHead().getNext().getData());
    Assertions.assertEquals('t', linkedList.getTail().getPrevious().getPrevious().getData());
    linkedList.display();
  }

  @Test
  public void addFirstElements() {
    linkedList.addFirst(5);
    linkedList.addFirst(4);
    linkedList.addFirst(3);
    linkedList.addFirst(2);
    linkedList.addFirst(1);
    Assertions.assertEquals(1, linkedList.getHead().getData());
    Assertions.assertEquals(2, linkedList.getHead().getNext().getData());
    Assertions.assertEquals(5, linkedList.getTail().getData());
    Assertions.assertEquals(4, linkedList.getTail().getPrevious().getData());
    Assertions.assertEquals(5, linkedList.getSize());
    linkedList.display();
  }
  
  @Test
  public void removeLastElementWhenLinkedListEmpty() {
    Assertions.assertThrows(IllegalArgumentException.class, linkedList::removeLast, "Linked list empty.");
  }

  @Test
  public void removeLastOnlyElement() {
    linkedList.addLast(1);
    Assertions.assertEquals(1, linkedList.getHead().getData());
    Assertions.assertEquals(1, linkedList.getTail().getData());
    Assertions.assertEquals(1, linkedList.removeLast());
    Assertions.assertEquals(0, linkedList.getSize());
    Assertions.assertNull(linkedList.getHead());
    Assertions.assertNull(linkedList.getTail());
  }

  @Test
  public void removeLastElements() {
    linkedList.addLast(1);
    linkedList.addLast("test");
    linkedList.addLast('t');
    List<Integer> numbers = Arrays.asList(1, 2, 3);
    linkedList.addLast(numbers);
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "1");
    map.put(2, "2");
    map.put(3, "3");
    linkedList.addLast(map);
    Assertions.assertEquals(map, linkedList.removeLast());
    Assertions.assertEquals(numbers, linkedList.getTail().getData());
    Assertions.assertEquals(1, linkedList.getHead().getData());
    Assertions.assertEquals(4, linkedList.getSize());
    Assertions.assertEquals(numbers, linkedList.removeLast());
    Assertions.assertEquals('t', linkedList.removeLast());
  }

  @Test
  public void removeFirstWhenLinkedListEmpty() {
    Assertions.assertThrows(IllegalArgumentException.class, linkedList::removeHead, "Linked List is empty.");
  }

  @Test
  public void removeFirstOnlyElement() {
    linkedList.addLast(1);
    Assertions.assertEquals(1, linkedList.getSize());
    Assertions.assertEquals(1, linkedList.removeHead());
    Assertions.assertEquals(0, linkedList.getSize());
  }

  @Test
  public void removeFirstElements() {
    linkedList.addLast(1);
    linkedList.addLast(2);
    linkedList.addLast(3);
    Assertions.assertEquals(3, linkedList.getSize());
    Assertions.assertEquals(1, linkedList.removeHead());
    Assertions.assertEquals(2, linkedList.getHead().getData());
    Assertions.assertEquals(3, linkedList.getHead().getNext().getData());
    Assertions.assertEquals(3, linkedList.getTail().getData());
    Assertions.assertEquals(2, linkedList.getTail().getPrevious().getData());
    Assertions.assertEquals(2, linkedList.getSize());
    Assertions.assertEquals(2, linkedList.removeHead());
    Assertions.assertEquals(3, linkedList.getHead().getData());
    Assertions.assertEquals(3, linkedList.getTail().getData());
    Assertions.assertEquals(1, linkedList.getSize());
  }
}