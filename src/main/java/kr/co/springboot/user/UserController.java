package kr.co.springboot.user;

import kr.co.springboot.user.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService opUserService;

    @RequestMapping(value="/registPage.do")
    public String registPageView(Model model){
        return "/user/registUserPage";
    }

    @RequestMapping(value="/insertUser.do", method = RequestMethod.POST)
    public String insertUser(UserVO userVo){

        Integer key = opUserService.insertUser(userVo);

        if(key != 0){
            return "/user/insertUserSuccessPage";
        }

        return "/user/insertUserFailPage";
    }

}
