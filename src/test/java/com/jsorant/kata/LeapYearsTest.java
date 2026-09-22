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

  @ParameterizedTest
  @ValueSource(ints = {1_700, 1_800, 2_100})
  void shouldNotBeLeapYearWhenItsDivisibleByOneHundredButNotByFourHundred(int year) {
    assertThat(LeapYears.check(year)).isFalse();
  }

  @ParameterizedTest
  @ValueSource(ints = {2_008, 2_012, 2_016})
  void shouldBeLeapYearWhenItsDivisibleByFourButNotByOneHundred(int year) {
    assertThat(LeapYears.check(year)).isTrue();
  }

  @ParameterizedTest
  @ValueSource(ints = {2_017, 2_018, 2_019})
  void shouldNotBeLeapYearWhenItsNotDivisibleByFour(int year) {
    assertThat(LeapYears.check(year)).isFalse();
  }
}
