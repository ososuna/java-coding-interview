package dev.ososuna.classes;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ArrayUnitTest {

  @Test
  public void testGetBiggest() {
    List<Double> numbers = List.of(0.9, -7.3, 12.8, 100.1, 24.7, 32.78);
    assertThat(Array.getBiggest(numbers), is(100.1));
  }

  @Test
  public void testClean() {
    List<String> list = new ArrayList<>();
    list.add("foo");
    list.add("bar");
    list.add(null);
    list.add("first");
    list.add("36");
    list.add("false");
    list.add("0");
    List<String> cleanList = new ArrayList<>();
    cleanList.add("foo");
    cleanList.add("bar");
    cleanList.add("first");
    cleanList.add("36");
    assertThat(Array.clean(list), is(cleanList));
  }
}
