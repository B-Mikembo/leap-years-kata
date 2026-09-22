package com.jsorant.kata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class LeapYearsTest {
  @ParameterizedTest
  @ValueSource(ints = {2_000})
  void shouldBeALeapYearWhenItsDivisibleByFourHundred(int year) {
    assertThat(LeapYears.check(year)).isTrue();
  }
}
