package kr.co.springboot.common;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebControllelr {

    @RequestMapping("/test1")
    public String test1(){
        return "test1";
    }

    @RequestMapping("/test2")
    public String test2(Model model){
        model.addAttribute("value", "이것은 model로 가져온 값입니다.");
        return "test";
    }
}
