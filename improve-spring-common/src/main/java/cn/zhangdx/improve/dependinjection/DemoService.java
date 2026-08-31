package cn.zhangdx.improve.dependinjection;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author zhangdx
 * @date 2026/8/31 11:46
 */
@AllArgsConstructor
@Service
public class DemoService {

    private final DemoRepository demoRepository;

    public String testDependInjection() {
        return "demoRepository is: " + demoRepository.toString();
    }
}
