package com.shifpeng.algorithmnovice.applets;

/**
 * @Project: Algorithm
 * @Description:
 * @Author: Steven
 * @Date: 2021/6/9 7:40 下午
 * <p>
 * 给定一个整数，打印这个数字的32位的进制数
 **/
public class PrintInt32Byte {


    public static void main(String[] args) {
        int num = 1;
        print(num);
    }

    /**
     * @param num
     */
    public static void print(int num) {
        //先不考虑符号位
        for (int i = 31; i >= 0; i--) {
            //1的二进制：00000000000000000000000000000001
            //左移一位：00000000000000000000000000000010
            //左移二位：00000000000000000000000000000100
            //&运算，都为1则为1
            //31位中每个位置为1时，与num做&运算，如果结果为0，那么该位置肯定为0
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }
}
