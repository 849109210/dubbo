import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 张杰
 * 2021/7/24
 */
public class UserServiceMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("userService.xml");
        context.start();
        System.in.read();
    }
}
