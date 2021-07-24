import com.zhangjie.pojo.Order;
import com.zhangjie.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 张杰
 * 2021/7/23
 */
public class service {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = (OrderService) context.getBean("remoteOrderService");
        Order order = orderService.creatOrder(1001,"小米手机",3999F, 2);
        System.out.println(order.getOrderId());
    }
}
