package service;

import org.apache.dubbo.config.annotation.DubboService;

import java.util.StringJoiner;

/**
 * 张杰
 @DubboService:暴露服务
  *     interfaceClass：暴露的接口的class
  *     version: 版本， 自定义的版本名称， 表示当前的实现类
  *     timeout：超时时间， 毫秒
  *     register：是否向注册中心，注册服务信息。 不注册是false
 */
@DubboService(interfaceClass = JavaFrameService.class,version = "1.0",timeout = 5000,register = false)
public class JavaFrameServiceImpl implements JavaFrameService{
    @Override
    public String javaFrame(String type) {
        StringJoiner joiner = new StringJoiner(",","{","}");
        if ("db".equals(type)){
            joiner.add("mybatis").add("hibernate").add("jpa");
        }else if ("web".equals(type)){
            joiner.add("SpringMVC").add("JSF").add("Struts").add("JFinal");
        }
        System.out.println("==JavaFrameServiceMain服务启动==");
        return joiner.toString();
    }
}
