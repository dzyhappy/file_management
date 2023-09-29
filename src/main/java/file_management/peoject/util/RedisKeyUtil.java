package file_management.peoject.util;


/**
*
* redis的key的工具类
*
* */
public class RedisKeyUtil {

    /*
    * 以下为示例
    * */
    private static final String SPLIT = ":";
    //登录凭证
    private static final String PREFIX_TICKET = "token";
    //用户信息
    private static final String PREFIX_USER = "user";

    // 登录的凭证
    public static String getTicketKey(String ticket) {
        return PREFIX_TICKET + SPLIT + ticket;
    }

    // 用户
    public static String getUserKey(int userId) {
        return PREFIX_USER + SPLIT + userId;
    }

}
