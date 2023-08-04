package com.example.springboot;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Unit tests for {@link com.example.springboot.FileUploadController}.
 */
class FileUploadControllerTest {

  private static final String UPLOAD_SUCCESS_URL =
      "/index.html?success=File+upload+completed";
  private static final String UPLOAD_ERROR_URL =
      "/index.html?error=File+is+not+a+PDF";

  private MockMvc mockMvc;

  /**
   * Set up the MockMvc instance for testing the
   * {@link com.example.springboot.FileUploadController}.
   * Configures the MockMvc with a standalone setup of the controller, setting
   * the view resolvers.
   */
  @BeforeEach
  public void setup() {
    InternalResourceViewResolver viewResolver =
        new InternalResourceViewResolver();
    viewResolver.setPrefix("/templates/");
    viewResolver.setSuffix(".html");

    mockMvc =
      MockMvcBuilders.standaloneSetup(new FileUploadController())
        .setViewResolvers(viewResolver)
        .build();
  }

  /**
   * Test the successful file upload scenario.
   *
   * @throws Exception if an error occurs during the test.
   */
  @Test
  void testSuccessfulFileUpload() throws Exception {
    MockMultipartFile file =
        new MockMultipartFile(
        "file", "test.pdf", "application/pdf",
        "Test PDF content".getBytes());

    mockMvc
        .perform(multipart("/upload").file(file))
        .andExpect(status().is3xxRedirection())
        .andExpect(redirectedUrl(UPLOAD_SUCCESS_URL));
  }

  /**
   * Test the scenario when an empty file is uploaded.
   *
   * @throws Exception if an error occurs during the test.
   */
  @Test
  void testEmptyFileUpload() throws Exception {
    MockMultipartFile file =
        new MockMultipartFile(
        "file", "test.pdf", "application/pdf",
            new byte[0]);

    mockMvc
        .perform(multipart("/upload").file(file))
        .andExpect(status().is3xxRedirection())
        .andExpect(redirectedUrl("/index.html"));
  }

  /**
   * Test the scenario when a non-PDF file is uploaded.
   *
   * @throws Exception if an error occurs during the test.
   */
  @Test
  void testNonPdfFileUpload() throws Exception {
    MockMultipartFile file =
        new MockMultipartFile(
        "file", "test.txt", "text/plain",
        "Test text content".getBytes());

    mockMvc
        .perform(multipart("/upload").file(file))
        .andExpect(status().is3xxRedirection())
        .andExpect(redirectedUrl(UPLOAD_ERROR_URL));
  }
}
