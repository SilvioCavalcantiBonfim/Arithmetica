package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import finance.Interest;

public class SimpleInterestTest {
  
  @Test
  public void testAmount() {
    double capital = 1000.0;
    double rate = 0.05;
    double time = 2.0;
    double expected = 1100.0;
    double actual = Interest.SIMPLE.amount(capital, rate, time);
    assertEquals(expected, actual, 0.001);
  }
}
