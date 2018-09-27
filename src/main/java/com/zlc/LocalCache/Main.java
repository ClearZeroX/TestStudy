package com.zlc.LocalCache;

import java.util.concurrent.TimeUnit;

/**
 * @author : ZLC
 * @create : 2018-09-27 10:49
 * @desc :
 **/
public class Main {

    public static void main(String[] args)throws Exception
    {
        TestService us = new TestService();
        for(int i=0;i<20;i++)
        {
            System.out.println(us.getName("1001"));
            //System.out.println(us.getName(String.valueOf(i)));
            TimeUnit.SECONDS.sleep(1);
        }
    }

}
