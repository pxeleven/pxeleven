package com.pxeleven.java;

import javax.swing.*;

/**
 * @author pxeleven
 * @create 2020-03-09- 16:39
 */
public class MainFrame extends JFrame {
    public MainFrame() {
        setSize(1024, 768);//设置窗口大小
        setTitle("我是窗口");//设置标题
        ImageIcon imageIcon = new ImageIcon("./src/image/img.png");
        setIconImage(imageIcon.getImage());//设置图片
        this.setLayout(null);//设置里面控件的布局方式
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置点击关闭对出程序
    }

    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);//显示窗口
    }
}
