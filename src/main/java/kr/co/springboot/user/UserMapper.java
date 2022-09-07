package kr.co.springboot.user;

import kr.co.springboot.user.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    // 회원가입
    Integer insertUser(UserVO userVo);

    // 로그인
    UserVO userLogin(UserVO userVo);
}
