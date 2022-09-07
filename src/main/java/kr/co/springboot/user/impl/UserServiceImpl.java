package kr.co.springboot.user.impl;

import kr.co.springboot.user.UserMapper;
import kr.co.springboot.user.UserService;
import kr.co.springboot.user.domain.UserVO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    // 회원가입 시 저장시간 넣어줄 Datetime형
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:sss");
    Date time = new Date();
    String localTime = format.format(time);

    @Resource
    private UserMapper userMapper;

    @Override
    public Integer insertUser(UserVO userVo) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userVo.setUserPw(passwordEncoder.encode(userVo.getUserPw()));
        userVo.setUserAuth("USER");
        userVo.setAppendDate(localTime);
        userVo.setUpdateDate(localTime);
        return userMapper.insertUser(userVo);
    }

    @Override
    public UserVO userLogin(UserVO userVo) {
        return userMapper.userLogin(userVo);
    }
}
