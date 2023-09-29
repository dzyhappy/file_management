package file_management.peoject.handler;

import com.alibaba.fastjson.JSON;
import file_management.peoject.common.Result;
import file_management.peoject.util.WebUtils;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* 认证错误处理器
* */

@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        String json = JSON.toJSONString(Result.fail("认证错误"));
        WebUtils.renderString(httpServletResponse,json);
    }
}