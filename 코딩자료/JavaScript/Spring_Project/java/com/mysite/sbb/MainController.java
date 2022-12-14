package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    
    @RequestMapping("/sbb")
    @ResponseBody
    public String index() {
        return "안녕하세요 sbb에 오신 것을 환영합니다.";
    }

    @RequestMapping("/")
    public String root() {
        return "chose_form";
    }

    @RequestMapping("/visual")
    public String visual() {
        return "redirect:/visual/list";
    }
}
