package cn.zhangdx.springmvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author ZDX
 * @date 2025/6/9 15:01
 */
public class ImproveSpringMvcWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ImproveSpringMvcApplicationConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {ImproveSpringMvcWebConfigure.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
