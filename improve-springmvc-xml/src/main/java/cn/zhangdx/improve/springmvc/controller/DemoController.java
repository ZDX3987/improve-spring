package cn.zhangdx.improve.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ZDX
 * @date 2025/9/6 22:42
 */
@RequestMapping("/demo")
@Controller
public class DemoController {

    @GetMapping("/name")
    @ResponseBody
    public String demoTextName(String name) {
        return "Hello Improve Spring MVC Xml Project! Name is " + name;
    }
}
