package com.zlc.LocalCache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author : ZLC
 * @create : 2018-09-27 10:42
 * @desc : 本地缓存，google的CacheBuilder缓存
 **/
public class TestService {

    private final LoadingCache<String,String> cache;

    public TestService(){
        cache = CacheBuilder.newBuilder().refreshAfterWrite(5, TimeUnit.SECONDS).build(new CacheLoader<String, String>() {
            @Override
            public String load(String id) throws Exception {
                System.out.println("method inovke");
                //这里执行查询数据库，等其他复杂的逻辑
                return "User:" + id;
            }
        });
    }

    public String getName(String id) throws ExecutionException {
        return cache.get(id);
    }




}
