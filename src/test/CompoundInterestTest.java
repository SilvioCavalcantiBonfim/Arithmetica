package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import finance.Interest;

public class CompoundInterestTest {

  @Test
  public void testAmount() {
    double capital = 1000.0;
    double rate = 0.05;
    double time = 2.0;
    double expected = 1102.5;
    double actual = Interest.COMPOUND.amount(capital, rate, time);
    assertEquals(expected, actual, 0.001);
  }
}
