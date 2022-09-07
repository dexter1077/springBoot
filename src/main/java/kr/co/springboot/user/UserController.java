package kr.co.springboot.user;

import kr.co.springboot.user.domain.UserVO;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService opUserService;

    // 회원가입 페이지 포워딩
    @RequestMapping(value="/registPage.do")
    public String registPageView(Model model){
        return "/user/registUserPage";
    }

    // 회원가입 진행
    @PostMapping(value = "/insertUser.do")
    public String insertUser(UserVO userVo){
        Integer result = opUserService.insertUser(userVo);
        return "index";
    }

    // 유저 로그인 페이지 포워딩
    @RequestMapping("/loginPage.do")
    public String loginUser(UserVO userVo){
        return "/user/login";
    }

    //
    @RequestMapping("/userLogin.do")
    public String userLogin(UserVO userVo){

        return "index";
    }

    // 로그인 성공 시
    @RequestMapping("/loginSuccessPage.do")
    public String userLoginSuccessPage(Model model, Authentication authentication){
        // Authentication 객체를 통해 유저 정보를 가져올 수 있다.
        //UserVO userVo = (UserVO)authentication.getPrincipal(); //userDetail 객체를 가져옴
        //model.addAttribute("info", userVo.getUserId() + "의" + userVo.getUsername() + "님");

        return "/user/loginSuccessPage";
    }

    // 로그인 실패 시
    @RequestMapping("/loginDenied.do")
    public String userLoginDenied(Model model){
        model.addAttribute("loginResult", "ID 또는 비밀번호가 맞지 않습니다.");
        return "/user/login";
    }

}
