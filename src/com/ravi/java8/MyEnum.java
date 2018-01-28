package com.ravi.java8;

/**
 * Created by ravi on 11/27/2017.
 */
public enum MyEnum {

    A("A") , B("B");

    private MyEnum(String val){
        System.out.println(val);
    }

    public static void main(String[] args) {
        MyEnum a = MyEnum.A;
        //MyEnum b = MyEnum.A;
    }
}
