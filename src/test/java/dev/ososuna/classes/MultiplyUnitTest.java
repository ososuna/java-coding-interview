package dev.ososuna.classes;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class MultiplyUnitTest {

  @Test
  public void testMultiplyTwoIntegers() {
    assertThat(Multiply.multiply(2, 2), is(4));
    assertThat(Multiply.multiply(5, 6), is(30));
    assertThat(Multiply.multiply(1, 8), is(8));
    assertThat(Multiply.multiply(124, 124), is(15376));
  }

  @Test
  public void testMultiplyByZero() {
    assertThat(Multiply.multiply(3, 0), is(0));
    assertThat(Multiply.multiply(0, 1), is(0));
    assertThat(Multiply.multiply(345, 0), is(0));
  }

  @Test
  public void testMultiplyByOneNegative() {
    assertThat(Multiply.multiply(3, -1), is(-3));
    assertThat(Multiply.multiply(-6, 40), is(-240));
  }

  @Test
  public void testMultiplyTwoNegative() {
    assertThat(Multiply.multiply(-4, -9), is(36));
    assertThat(Multiply.multiply(-5, -5), is(25));
    assertThat(Multiply.multiply(-21, -1), is(21));
  }
}
