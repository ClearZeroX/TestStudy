package com.zlc.redis;

import redis.clients.jedis.Jedis;

/**
 * @author : ZLC
 * @create : 2018-07-18 17:11
 * @desc : 学习Redis
 **/
public class TestRedis {

    public static void main(String[] args) {

        Jedis jedis = new Jedis("localhost",6379);
        jedis.connect();
        jedis.set("key1","values1");

        String v1 = jedis.get("key1");
        System.out.println(v1);
        System.out.println(jedis.keys("*"));

        //设置过期时间
        jedis.expire("key1",5);

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String v2 = jedis.get("key1");
        System.out.println(v2); // null

        System.out.println(jedis.keys("*"));//[]

    }
}
