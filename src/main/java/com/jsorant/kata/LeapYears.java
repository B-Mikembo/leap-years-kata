package com.jsorant.kata;

public class LeapYears {
  public static boolean check(int year) {
    if(year % 400 == 0) return true;
    return year % 4 == 0 && year % 100 != 0;
  }
}
