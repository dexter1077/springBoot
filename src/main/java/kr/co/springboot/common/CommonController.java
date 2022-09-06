package kr.co.springboot.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonController {

    @RequestMapping(value="/")
    public ModelAndView testPage(ModelAndView mv){
        mv.setViewName("index");
        return mv;
    }
}
