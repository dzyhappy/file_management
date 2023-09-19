package file_management.peoject.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

    /*
    * 返回示例
    * return Result.success();
    * return Result.success(page);
    * return Result.success("类型获取成功", typeString);
    * */

    // 1成功，0失败
    private int code;
    private String message;
    private Object data;

    public static Result success() {
        return Result.success("操作成功", null);
    }

    public static Result success(Object data) {
        return Result.success("操作成功", data);
    }

    /*
    * {
          "code": 1,
          "message": "string",
          "data": [
            {
              "id": 0,
              "name": "string",
              "type_id": 0,
              "overview": "string"
            }
          ]
        }
        * 成功时
    * */
    public static Result success(String msg, Object data) {
        Result result = new Result();
        result.code = 1;
        result.message = msg;
        result.data = data;
        return result;
    }

    /*
    * {
          "code": 0,
          "message": "string",
          "data": "Unknown Type: null"
       }
       * 失败时
    * */
    public static Result fail(String msg) {
        Result result = new Result();
        result.code = 0;
        result.message = msg;
        result.data = null;
        return result;
    }

}