package file_management.peoject.common;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * 图片上传相应配置类
 *
 */
@Data
@Component
public class Consts {
    @Value("${file.upload.dir}")
    private String uploadDir;


}