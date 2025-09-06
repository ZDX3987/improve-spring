package cn.zhangdx.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZDX
 * @date 2025/6/9 14:58
 */
@RestController
@RequestMapping("/demo")
public class ImproveSpringMvcController {

    @GetMapping
    public String demoGet(String name) {
        return "Hello Improve Spring MVC: " + name;
    }

    @GetMapping("/{name}")
    public String pathMatch(@PathVariable String name) {
        return "Hello Improve Spring MVC: " + name + " this is the path Match";
    }

    @GetMapping("/*")
    public String secondMatch(String name) {
        return "Hello Improve Spring MVC: " + name + " this is the Second Match";
    }
}
