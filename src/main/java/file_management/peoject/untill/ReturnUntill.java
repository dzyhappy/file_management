package file_management.peoject.untill;

import lombok.Data;

@Data
public class ReturnUntill {
    Integer code;
    String message;
    Object data;
    public ReturnUntill(Integer code, String message, Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    ReturnUntill(){}
}
