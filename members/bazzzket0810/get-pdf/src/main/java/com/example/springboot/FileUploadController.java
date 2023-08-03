package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

@Controller
@SpringBootApplication
public class FileUploadController {

	private static final String UPLOAD_FOLDER = "/../../.tmp/";

	@PostMapping("/upload")
	public String handleFileUpload(@RequestParam("file") MultipartFile file) {
		// Проверка наличия файла
		if (file.isEmpty()) {
			return "redirect:/index.html";
		}

		// Проверка на тип PDF файла
		if (!file.getContentType().equalsIgnoreCase("application/pdf")) {
			return "redirect:/index.html?error=File is not a PDF";
		}

		// Определение расположения класса и создание файла в директории \get-pdf\.tmp
		try {
			File classLocation = new File(FileUploadController.class.getProtectionDomain().getCodeSource().getLocation().toURI());
			File tmpDirectory = new File(classLocation.getParentFile().getParentFile(), UPLOAD_FOLDER);
			if (!tmpDirectory.exists()) {
				tmpDirectory.mkdirs();
			}

			File destFile = new File(tmpDirectory, file.getOriginalFilename());

			// Сохранение файла в папку \get-pdf\.tmp
			file.transferTo(destFile);

		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
			return "redirect:/index.html?error=Error saving the file";
		}

		return "redirect:/index.html?success=File upload completed"; // Cообщение об успешной загрузке
	}

	public static void main(String[] args) {
		SpringApplication.run(FileUploadController.class, args);
	}
}
