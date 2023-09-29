package file_management.peoject.util;

import com.alibaba.fastjson2.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.DigestUtils;

import java.util.Map;
import java.util.UUID;


/*
*
* 一些工具类
* 转json工具
*
* */

public class managementUtil {

    // 生成随机字符串
    public static String generateUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    // MD5加密
    // hello -> abc123def456
    // hello + 3e4a8 -> abc123def456abc
    public static String md5(String key) {
        if (StringUtils.isBlank(key)) {
            return null;
        }
        return DigestUtils.md5DigestAsHex(key.getBytes());
    }

    //使用fastjson构建json字符串，按照返回格式构建
    //  你们根据需要重载
    public static String getJSONString(int code, String message, Map<String, Object> map) {
        JSONObject json = new JSONObject();
        json.put("code", code);                 //1正确，0错误
        json.put("message", message);
        if (map != null) {
            for (String key : map.keySet()) {
                json.put(key, map.get(key));
            }
        }
        return json.toJSONString();
    }

    //两个重载方法
    public static String getJSONString(int code, String message) {
        return getJSONString(code, message, null);
    }
    public static String getJSONString(int code) {
        return getJSONString(code, null, null);
    }

}
