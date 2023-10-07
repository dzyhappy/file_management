package file_management.peoject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class FileManagementApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(FileManagementApplication.class);
        app.setDefaultProperties(Collections.singletonMap("application-local","local"));
        app.setDefaultProperties(Collections.singletonMap("application-dev","dev"));
        app.run(args);
    }

}
