package file_management.peoject.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import file_management.peoject.common.Result;
import file_management.peoject.entity.LoginUser;
import file_management.peoject.entity.User;
import file_management.peoject.entity.vo.UserVO;
import file_management.peoject.mapper.UserMapper;
import file_management.peoject.service.UserService;
import file_management.peoject.util.JwtUtil;
import file_management.peoject.util.NameConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
* @author dzyhappy
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2023-09-18 16:15:50
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService, NameConstant {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserMapper userMapper;

    @Override
    public Result login(User user) {
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword());
        /**
         * 这里越过了UsernamePasswordAuthentication这个实现类，直接调用authenticationManager
         * */
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);
        if(Objects.isNull(authenticate)){
            throw new RuntimeException("用户名或密码错误");
        }
        //使用userid生成token
        LoginUser loginUser = (LoginUser) authenticate.getPrincipal();
        String jwt = JwtUtil.createJWT(JSON.toJSONString(loginUser));

        //构建返回对象
        UserVO userVO = new UserVO();
        userVO.setUsername(loginUser.getUser().getUsername());
        userVO.setToken(jwt);
        userVO.setHeaderUrl(loginUser.getUser().getHeaderUrl());
        return Result.success("登录成功",userVO);
    }

}




