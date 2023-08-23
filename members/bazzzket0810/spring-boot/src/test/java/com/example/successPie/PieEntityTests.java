package com.example.successPie;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PieEntityTests {

  @Test
  void testGetUser() {
    String expectedUser = "testUser";

    PieEntity pieEntity = new PieEntity();
    pieEntity.setUser(expectedUser);

    String actualUser = pieEntity.getUser();

    assertEquals(expectedUser, actualUser);
  }

  @Test
  void testGetMyPercent() {
    int expectedMyPercent = 50;

    PieEntity pieEntity = new PieEntity();
    pieEntity.setMyPercent(expectedMyPercent);

    int actualMyPercent = pieEntity.getMyPercent();

    assertEquals(expectedMyPercent, actualMyPercent);
  }

  @Test
  void testGetLeftPercent() {
    int expectedLeftPercent = 30;

    PieEntity pieEntity = new PieEntity();
    pieEntity.setLeftPercent(expectedLeftPercent);

    int actualLeftPercent = pieEntity.getLeftPercent();

    assertEquals(expectedLeftPercent, actualLeftPercent);
  }
}
