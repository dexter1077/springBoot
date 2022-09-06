package kr.co.springboot.user.impl;

import kr.co.springboot.user.UserMapper;
import kr.co.springboot.user.UserService;
import kr.co.springboot.user.domain.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Integer insertUser(UserVO userVo) {
        return userMapper.insertUser(userVo);
    }
}
