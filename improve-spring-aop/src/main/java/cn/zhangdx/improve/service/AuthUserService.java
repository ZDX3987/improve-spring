package cn.zhangdx.improve.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author zhangdx
 * @date 2026/9/2 17:37
 */
@Slf4j
@Service
public class AuthUserService {

    public void auth() {
        log.info("测试CGLIB代理的类执行");
    }
}
