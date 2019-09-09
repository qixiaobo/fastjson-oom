package me.qixiaobo.example;

import com.alibaba.fastjson.JSON;

/**
 * @author qixiaobo
 */
public class FastjsonExample {
    public static void main(String[] args) {
        JSON.parse("{qixiaobo:\"\\x");
    }
}
