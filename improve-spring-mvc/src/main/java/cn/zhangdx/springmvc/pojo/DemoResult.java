package cn.zhangdx.springmvc.pojo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author ZDX
 * @date 2025/9/8 22:53
 */
@Data
public class DemoResult {

    private String name;

    private Integer age;

    private LocalDateTime date;

    public static DemoResult defaultResult() {
        DemoResult demoResult = new DemoResult();
        demoResult.setName("zhangdx999");
        demoResult.setAge(18);
        demoResult.setDate(LocalDateTime.now());
        return demoResult;
    }
}
