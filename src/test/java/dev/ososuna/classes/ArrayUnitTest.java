package dev.ososuna.classes;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class ArrayUnitTest {

  @Test
  public void testGetBiggest() {
    List<Double> numbers = List.of(0.9, -7.3, 12.8, 100.1, 24.7, 32.78);
    assertThat(Array.getBiggest(numbers), is(100.1));
  }
}
