package file_management.peoject.handler;

import com.alibaba.fastjson.JSON;
import file_management.peoject.common.Result;
import file_management.peoject.util.WebUtils;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 授权异常处理类
 * */

@Component
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        String json = JSON.toJSONString(Result.fail("权限不足，请联系管理员"));
        WebUtils.renderString(httpServletResponse,json);
    }
}