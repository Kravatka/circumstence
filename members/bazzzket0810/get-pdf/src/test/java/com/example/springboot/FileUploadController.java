package com.example.springboot;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/** A controller class responsible for handling file uploads in a Spring Boot
 *  application. */
@Controller
@SpringBootApplication
public class FileUploadController {

  // Define the constant for the upload folder
  private static final String UPLOAD_FOLDER = "/../../.tmp/";

  /**
   * The main method to run the Spring Boot application.
   *
   * @param args The command line arguments.
   */
  public static void main(final String[] args) {
    SpringApplication.run(FileUploadController.class);
  }

  /**
   * Handles the file upload operation.
   *
   * @param file The uploaded file to be processed.
   * @return A redirect URL based on the result of the file upload.
   */
  @PostMapping("/upload")
  public String handleFileUpload(
      @RequestParam("file") final MultipartFile file) {

    // Check if the file is empty
    if (file.isEmpty()) {
      return "redirect:/index.html";
    }

    // Check if the file is a PDF
    if (!Objects.requireNonNull(file.getContentType()).equalsIgnoreCase(
        "application/pdf")) {
      return "redirect:/index.html?error=File is not a PDF";
    }

    try {
      // Get the current class location
      File classLocation =
          new File(
              FileUploadController.class
                  .getProtectionDomain()
                  .getCodeSource()
                  .getLocation()
                  .toURI());

      // Create a temporary directory for file storage
      File tmpDirectory =
          new File(
          classLocation
          .getParentFile()
          .getParentFile(),
          UPLOAD_FOLDER);

      // Create the directory if it doesn't exist
      if (!tmpDirectory.exists()) {
        tmpDirectory.mkdirs();
      }

      // Set the destination file path
      File destFile =
          new File(
          tmpDirectory,
          Objects
          .requireNonNull(file.getOriginalFilename()));

      // Transfer the uploaded file to the destination
      file.transferTo(destFile);

    } catch (IOException | URISyntaxException e) {
      e.printStackTrace();

      return "redirect:/index.html?error=Error saving the file";
    }

    return "redirect:/index.html?success=File upload completed";
  }
}
