package com.zjy.netty_springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping()
    public String getIndex(){
        return "html/videoMM";
    }

}
