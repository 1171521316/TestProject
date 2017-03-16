package com.hand.demo;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by 曹超 on 2017/3/16.
 */
public class DemoIdea {
    public static void main(String[] arg) {
        Thread t = new Thread() {
            @Override
            public void run() {
                int i = 0;
                while (i < 10) {
                    System.out.println("i:=" + i);
                    Test t=new Test();
                    i++;
                }
            }
        };

    t.start();
        Image image = new BufferedImage(3, 3, BufferedImage.TYPE_3BYTE_BGR);

    }
}

class Test {
   public Test(){
       System.out.println("test");
   }
}