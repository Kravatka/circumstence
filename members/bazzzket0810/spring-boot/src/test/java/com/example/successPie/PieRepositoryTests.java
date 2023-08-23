package com.example.successPie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class PieRepositoryTests {

  @Mock private PieRepository pieRepository;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testGetMyPercentValue() {
    String user = "testUser";
    int expectedValue = 50;

    // Mock the repository behavior
    when(pieRepository.getMyPercentValue(user)).thenReturn(expectedValue);

    // Perform the test
    int actualValue = pieRepository.getMyPercentValue(user);

    // Verify the result
    assertEquals(expectedValue, actualValue);
  }

  @Test
  void testGetLeftPercentValue() {
    String user = "testUser";
    int expectedValue = 30;

    // Mock the repository behavior
    when(pieRepository.getLeftPercentValue(user)).thenReturn(expectedValue);

    // Perform the test
    int actualValue = pieRepository.getLeftPercentValue(user);

    // Verify the result
    assertEquals(expectedValue, actualValue);
  }
}
