package file_management.peoject.util;

/**
 *  定义常量
 */
public interface NameConstant {

    /*
    *   登录超时时间，2天
    * */
    int DEFAULT_EXPIRED_SECONDS=24*2;

    /*
     * 权限: 普通用户
     */
    String AUTHORITY_USER = "user";

    /*
     * 权限: 管理员
     */
    String AUTHORITY_ADMIN = "admin";

}
