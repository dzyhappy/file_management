package file_management.peoject.entity.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVO implements Serializable {

    /**
     * 头像路径
     */
    private String headerUrl;

    private String username;

    private String token;
}
