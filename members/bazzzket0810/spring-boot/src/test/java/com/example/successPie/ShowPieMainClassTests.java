package com.example.successPie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShowPieMainClassTests {

  @Test
  void testMain() {
    // Test that the main method runs without errors
    String[] args = {};
    assertDoesNotThrow(() -> ShowPieMainClass.main(args));
  }
}
