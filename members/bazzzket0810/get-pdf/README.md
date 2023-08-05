# Overview of the File Upload Application with Spring Boot

This is a simple Spring Boot application that allows users to upload PDF files to the server. The application provides a user interface where users can select a PDF file and upload it to the server. The server validates the file type to ensure it is a PDF before saving it to a temporary directory.

## Features

- User-friendly interface for selecting and uploading PDF files.
- Server-side validation to ensure only PDF files are accepted.
- Temporary storage of uploaded files in the `.tmp` directory within the application.

## Getting Started

1. Clone the repository to your local machine.
2. Make sure you have Java and Maven installed on your system.
3. Open the project in your favorite IDE (e.g., IntelliJ, Eclipse).
4. Build the project and resolve any dependencies.
5. Run the application (`FileUploadController`) using the `main` method.

## Usage

1. Access the application in your web browser at `http://localhost:8080`.
2. Select a PDF file using the provided file input.
3. Click the "Upload" button to submit the file to the server.
4. The application will display success or error messages based on the upload result.

## Configuration

The default upload folder for temporary storage is `/../../.tmp/`, but you can modify it by changing the `UPLOAD_FOLDER` constant in the `FileUploadController` class.

## Dependencies

This project uses the following Spring Boot starter dependencies:

- `spring-boot-starter-web`: Provides web-related functionalities.
- `spring-boot-starter-thymeleaf`: Integrates Thymeleaf templating engine for HTML rendering.
- `spring-boot-starter-test`: Includes testing dependencies.

## Contributing

Feel free to fork this repository and submit pull requests for any enhancements or bugfixes. Your contributions are greatly appreciated.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

## Author

This project was created by [Your Name]. You can contact me at [your.email@example.com].

Thank you for using this File Upload Application with Spring Boot. Happy uploading!

## Let’s build and run the program

Open a command-line (or terminal) and navigate to the folder where you have the project files. We can build and run the application by issuing the following command:

## MacOS/Linux
```./gradlew bootRun```

## Windows
```.\gradlew.bat bootRun```
