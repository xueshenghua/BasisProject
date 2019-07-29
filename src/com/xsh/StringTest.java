package com.xsh;

/**
 * @auther: xueshh
 * @date: 2019/7/24 07:16
 */

public class StringTest {

    public static void main(String[] args) {
        String info = "你好世界";
        for (int i = 0; i < info.length(); i++) {
            //转为十六进制  \u4f60\u597d\u4e16\u754c
            System.out.print("\\u" +Integer.toHexString(info.charAt(i)));
        }
        System.out.println();
        System.out.println("测试Git Test");

        System.out.println("IDEA中Git测试还不熟练呀~~~");
    }
}
