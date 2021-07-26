package com.zhangjie;

import model.Menu;
import service.MyMenuService;

/**
 * 张杰
 * 2021/7/26
 */
public class FileMenuServiceService implements MyMenuService {
    @Override
    public Menu ckeckMenu(String name, String description) {
        System.out.println("===fileMenu===");
        Menu menu = new Menu();
        menu.setName("必胜客"+name);
        menu.setDescription("必胜客"+description);
        return menu;
    }
}
