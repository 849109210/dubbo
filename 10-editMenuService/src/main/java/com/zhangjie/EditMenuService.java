package com.zhangjie;

import model.Menu;
import service.MyMenuService;

/**
 * 张杰
 * 2021/7/26
 */
public class EditMenuService implements MyMenuService {
    @Override
    public Menu ckeckMenu(String name, String description) {
        System.out.println("*****editMenu*****");
        Menu menu = new Menu();
        menu.setName("肯德基"+name);
        menu.setDescription("肯德基"+description);
        return menu;
    }
}
