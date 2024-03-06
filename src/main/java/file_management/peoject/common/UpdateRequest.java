package file_management.peoject.common;

import lombok.Data;

@Data
public class UpdateRequest {

    private Integer id;
    private String file;
    private Integer typeId;
    private String name;
    private String overview;
}
