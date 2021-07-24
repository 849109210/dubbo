package service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import service.JavaFrameService;
import service.TestService;

/**
 * 张杰
 * 2021/7/24
 */
@Service("appService")
public class TestServiceImpl implements TestService {

    /**
     *  @DubboReference:引用远程服务
     *      interfaceClass:接口的class
     *      url：在直连模式中，远程服务的访问地址
     *      version:和提供者一样。
     *      check： 叫做检查相，默认是true。
     *        true：在消费者启动时，需要检查提供者是否存在，如果不存在报错。
     *        false：不检查提供者。
     *
     *    位置： 在成员变量的上面
     */
    @DubboReference(interfaceClass = JavaFrameService.class,url = "dubbo://localhost:20880",check = false,version = "1.0")
    private JavaFrameService javaFrameService;

    @Override
    public String quertFrameName(String type) {
        String s = javaFrameService.javaFrame(type);
        return s;
    }
}
