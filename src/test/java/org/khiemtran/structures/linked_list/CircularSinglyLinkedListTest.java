package org.khiemtran.structures.linked_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class CircularSinglyLinkedListTest {
  private final CircularSinglyLinkedList<Object> linkedList = new CircularSinglyLinkedList<>();

  @Test
  public void addOnlyElement() {
    Assertions.assertNull(linkedList.getHead());
    Assertions.assertEquals(0, linkedList.getSize());
    linkedList.add(1);
    Assertions.assertEquals(1, linkedList.getHead().getData());
    Assertions.assertEquals(1, linkedList.getSize());
  }

  @Test
  public void addElements() {
    linkedList.add(1);
    linkedList.add("test");
    linkedList.add('t');
    linkedList.add(Arrays.asList(1, 2, 3));
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "1");
    map.put(2, "2");
    map.put(3, "3");
    linkedList.add(map);
    Assertions.assertEquals(5, linkedList.getSize());
    Assertions.assertEquals(1, linkedList.getHead().getData());
    CircularSinglyLinkedList.Node<Object> current = linkedList.getHead();
    while (current.getNext() != linkedList.getHead()) {
      current = current.getNext();
    }
    Assertions.assertEquals(map, current.getData());
    linkedList.display();
  }
}