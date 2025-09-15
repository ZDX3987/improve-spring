package cn.zhangdx.springmvc.pojo;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author ZDX
 * @date 2025/9/8 16:56
 */
@Data
public class DemoParam {

    private String name;

    @NotNull(message = "年龄字段不能为空")
    private Integer age;
}
