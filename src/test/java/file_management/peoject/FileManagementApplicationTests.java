package file_management.peoject;

import file_management.peoject.service.impl.DocumentsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;

@SpringBootTest
class FileManagementApplicationTests {


    @Autowired
    DocumentsServiceImpl services;

    @Test
    void contextLoads() {

    }

}
