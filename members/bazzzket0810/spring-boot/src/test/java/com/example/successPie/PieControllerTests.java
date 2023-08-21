package com.example.successPie;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

class PieControllerTests {

  @InjectMocks private PieController pieController;

  @Mock private PieRepository pieRepository;

  @Mock private Model model;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void testGetPies() {
    int expectedMyPercent = 50;
    int expectedLeftPercent = 30;

    when(pieRepository.getMyPercentValue("basket0810")).
      thenReturn(expectedMyPercent);
    when(pieRepository.getLeftPercentValue("basket0810")).
      thenReturn(expectedLeftPercent);

    String result = pieController.getPies(model);

    assertEquals("pie/index", result);
    verify(pieRepository, times(1)).
      getMyPercentValue("basket0810");
    verify(pieRepository, times(1)).
      getLeftPercentValue("basket0810");
    verify(model, times(1)).addAttribute(
      "myPercentValue", expectedMyPercent);
    verify(model, times(1)).addAttribute(
      "leftPercentValue", expectedLeftPercent);
  }
}
