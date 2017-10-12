package com.ciaosgarage.tbook.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TempCtrl {
    @RequestMapping("/")
    public String indexView() {
        return "index";
    }
}
