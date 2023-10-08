package file_management.peoject.common;

import lombok.Data;

@Data
public class UploadRequest {
    private String file;
    private Integer typeId;
    private String name;
    private String overview;
}
