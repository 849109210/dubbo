import model.Menu;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MyMenuService;

/**
 * 张杰
 * 2021/7/26
 */
public class UseMenu {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("UserMenu.xml");
        MyMenuService fileService = (MyMenuService) context.getBean("fileService");
        Menu menu = fileService.ckeckMenu("餐厅", "外卖");
        System.out.println(menu);

        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("UserMenu.xml");
        MyMenuService editService = (MyMenuService) context.getBean("editService");
        Menu menu1 = editService.ckeckMenu("餐厅", "外卖");
        System.out.println(menu1);

    }
}
