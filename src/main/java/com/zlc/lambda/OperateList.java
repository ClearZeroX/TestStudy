package com.zlc.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : ZLC
 * @create : 2018-09-26 10:15
 * @desc : 使用lambda表达式操作list
 **/
public class OperateList {

    public static void main(String[] args) {

        //todo 使用lambda表达式对列表进行迭代
        String[] atp = {"1", "2", "3", "4", "5","6", "7"};
        List<String> players =  Arrays.asList(atp);
        // 以前的循环方式
        for (String player : players) {
            System.out.print(player + "; ");
        }
        // 使用 lambda 表达式以及函数操作(functional operation)
        players.forEach((player) -> System.out.print(player + "; "));
        // 在 Java 8 中使用双冒号操作符(double colon operator)
        players.forEach(System.out::println);

        /*//todo
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("3");
        stringList.add("4");
        long bb = 0;
        for(int i = 0; i < players.size();i++){
            String aa = players.get(i);
             bb = stringList.stream().filter(string -> aa.equals(string)).count();
            System.out.println(bb);
        }*/


    }

}
