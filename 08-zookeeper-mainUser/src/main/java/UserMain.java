import model.Address;
import model.MyOrder;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MainService;
import service.MyOrderService;
import service.UserService;

/**
 * 张杰
 * 2021/7/24
 */
public class UserMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("main.xml");

        MainService mainService = (MainService) context.getBean("mainServiceImpl");
        MyOrder myOrder = mainService.buy(11111, "手机",4999);
        System.out.println(myOrder);
    }
}
