package file_management.peoject.util;

/**
 *  定义常量
 */
public interface NameConstant {

    //以下为示例

    /*
    *   默认状态登录凭证超时时间，2天
    * */
    int DEFAULT_EXPIRED_SECONDS=24*2;

    /*
    *   勾选记住我时的超时时间，7天
    * */
    int REMEMBER_EXPIRED_SECONDS=24*7;

    /*
     * 系统用户ID
     */
    int SYSTEM_USER_ID = 1;

    /*
     * 权限: 普通用户
     */
    String AUTHORITY_USER = "user";

    /*
     * 权限: 管理员
     */
    String AUTHORITY_ADMIN = "admin";

}
