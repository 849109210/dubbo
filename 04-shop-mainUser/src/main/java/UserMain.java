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
       /* MyOrderService myOrderService = (MyOrderService) context.getBean("remoteMyOrderService");
        MyOrder myOrder = myOrderService.creatNewOrder(1, "手机", 2998);
        System.out.println(myOrder);

        UserService userService = (UserService) context.getBean("remoteUserService");
        Address address = userService.checkAddressByUid(1);
        System.out.println(address);*/

        MainService mainService = (MainService) context.getBean("mainServiceImpl");
        MyOrder myOrder = mainService.buy(1, "电脑",7500);
        System.out.println(myOrder);
    }
}
