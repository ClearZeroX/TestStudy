package com.zlc.lambda;

/**
 * @author : ZLC
 * @create : 2018-09-26 9:40
 * @desc : @FunctionalInterface告诉编译器这是一个函数式接口，当然你不这么写也可以，标识后明确了这个函数中 只有一个抽象方法
 *             将 行为 (判断是否是成人，或者是判断是否大于30岁) 传递进去，函数式接口告诉你结果是什么。不需要每一个行为都写一个方法
 **/
public class FunctionalInterfaceDemo {

    @FunctionalInterface
    interface Predicate<T>{
        boolean test(T t);
    }

    public static boolean doPredicate(int age,Predicate<Integer> predicate){
        return predicate.test(age);
    }

    public static void main(String[] args) {
        boolean isAdult = doPredicate(20,x -> x >= 20);
        System.out.println(isAdult);
    }


}
