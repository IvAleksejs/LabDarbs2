package LabDarbs2;

public class MyList {
  private Node head;
  private int size;

  public MyList() {
    head = null;
    size = 0;
  }

  private class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      next = null;
    }
  }

  public void add(int data) {
    Node list = new Node(data);

    if (head == null) {
      head = list;
    } else {
      Node current = head;

      while (current.next != null) {
        current = current.next;
      }

      current.next = list;
    }

    size++;
  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }

    Node current = head;

    for (int i = 0; i < index; i++) {
      current = current.next;
    }

    return current.data;
  }
}