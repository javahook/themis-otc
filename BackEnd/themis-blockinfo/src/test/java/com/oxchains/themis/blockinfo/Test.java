package com.oxchains.themis.blockinfo;

import java.util.Date;

/**
 * @author oxchains
 * @time 2018-05-23 18:53
 * @name Test
 * @desc:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("0x80dabe63c879505f9859b828e133325ac818a68276d097ff145cd962dd76784e".length());
        Date date = new Date(1527140701000L);
        System.out.println(date);
        System.out.println(System.currentTimeMillis());
        Long ll = Long.valueOf("5b06515d",16);
        System.out.println(ll);
    }
}