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

  @Test
  public void testFlatten() {
    List<List<Integer>> twoDimensionList = new ArrayList<>();
    List<Integer> list1 = List.of(11, 4, 42);
    List<Integer> list2 = List.of(125, 1, 56, 81);
    List<Integer> list3 = List.of(112, 2);
    twoDimensionList.add(list1);
    twoDimensionList.add(list2);
    twoDimensionList.add(list3);
    List<Integer> list = List.of(11, 4, 42, 125, 1, 56, 81, 112, 2);
    assertThat(Array.flatten(twoDimensionList), is(list));
  }
}
