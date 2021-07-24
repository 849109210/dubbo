import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestService;

/**
 * 张杰
 * 2021/7/24
 */
//采用注解的方式进行开发
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        TestService testService = (TestService) context.getBean("appService");
        String web = testService.quertFrameName("web");
        System.out.println("采用注解开发");
        System.out.println(web);
    }
}
