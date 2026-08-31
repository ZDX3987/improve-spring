package cn.zhangdx.improve.dependinjection;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author zhangdx
 * @date 2026/8/31 11:45
 */
@Slf4j
@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    public void testDependInjection() {
        log.info("testDependInjection complete! demoService-{}", demoService.testDependInjection());
    }


}
