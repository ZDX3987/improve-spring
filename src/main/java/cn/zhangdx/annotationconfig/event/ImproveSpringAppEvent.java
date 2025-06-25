package cn.zhangdx.annotationconfig.event;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ZDX
 * @date 2025/6/6 21:10
 */
@AllArgsConstructor
@Data
public class ImproveSpringAppEvent {

    private String message;

    private boolean hidden;
}
