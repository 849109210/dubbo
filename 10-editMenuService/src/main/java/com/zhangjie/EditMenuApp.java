package com.zhangjie;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 张杰
 * 2021/7/26
 */
public class EditMenuApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("editMenu.xml");
        context.start();
        System.in.read();
    }
}
