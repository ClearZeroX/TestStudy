package com.zlc.thread;

import java.util.Date;
import java.util.UUID;

/**
 * @author : ZLC
 * @create : 2018-09-09 12:51
 * @desc :
 **/
public class TestThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }
    public static void main(String[] args) {

        /*for(int i = 0; i < 20; i ++){
            TestThread t = new TestThread();
            t.start();
        }*/

        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());

        String aa = "<wsa:MessageID>${messageId}</wsa:MessageID>";
        System.out.println(aa.replace("${messageId}","jjjjj"));

        System.out.println(aa.indexOf("<wsa:MessageID>"));
        System.out.println(aa.indexOf("</wsa:MessageID>"));
        System.out.println(aa.substring(aa.indexOf("<wsa:MessageID>")+15,aa.indexOf("</wsa:MessageID>")));

    }
}
