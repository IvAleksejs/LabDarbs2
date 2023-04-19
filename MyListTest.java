package LabDarbs2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyListTest {
  @Test
  public void testAddOneItem() {
    MyList list = new MyList();
    list.add(3);
    assertEquals(3, list.get(0));
  }

  @Test
  public void testAddSecondItem() {
    MyList list = new MyList();
    list.add(3);
    list.add(5);
    assertEquals(5, list.get(1));
  }

  @Test
  public void testFirstItemRemainsAfterAddingSecond() {
    MyList list = new MyList();
    list.add(3);
    list.add(5);
    assertEquals(3, list.get(0));
  }
}
