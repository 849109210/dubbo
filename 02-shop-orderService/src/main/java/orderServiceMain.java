import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MyOrderService;

import java.io.IOException;

/**
 * 张杰
 * 2021/7/24
 */
public class orderServiceMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("orderService.xml");
        context.start();
        System.in.read();
    }
}
