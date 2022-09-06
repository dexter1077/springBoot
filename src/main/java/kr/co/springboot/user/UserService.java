package kr.co.springboot.user;

import kr.co.springboot.user.domain.UserVO;
import org.springframework.stereotype.Service;

public interface UserService {

    Integer insertUser(UserVO userVo);
}
