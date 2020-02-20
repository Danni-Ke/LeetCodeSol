package com.example;

public class divide_Two_Integers_29 {
    public static void main(String[] args){
        //成功绝对值
        long s2 = Math.abs((long)Integer.MIN_VALUE);
        //这个无法取绝对值
        int s =Math.abs(Integer.MIN_VALUE);
        System.out.println(s2);
    }
    //参考：https://www.cnblogs.com/Jessey-Ge/p/11043535.html
    //method 1: ez version
    public int divide(int dividend, int divisor) {
        //两种溢出情况：1- 除数为0  2-被除数是最小int， 除数为-1
        if(divisor == 0) return Integer.MAX_VALUE;
        if(divisor == -1){
            return dividend == Integer.MIN_VALUE? Integer.MAX_VALUE: - dividend;
        }

        boolean answerisNeg = true;
        if((dividend >0 && divisor>0)||(dividend<0 && divisor<0)) {
            answerisNeg = false;
        }
        //why using long?
        //
        /*既然不能用乘、除、取模，只能用移位操作来完成了。将除数 divisor 每次左移一位，
        找到最接近被除数且不大于被除数 dividend的一个数，然后将被除数减去这个数，继续之前的操作。
        例如：31除以3，将3不断左移，直到左移3位后达到最接近31且不大于31的数，即3*2*2*2=24(此时
        相当于将3乘以了8，这个8是结果的一部分)，然后将31-24=7，继续之前的操作，左移3，直到最接近
        7且不大于7的一个数，即将3左移一位得到3*2=6（这个2也是结果的一部分），然后7-6=1，继续之前
        的操作，因为3已经大于1了，所以不需要左移了，即得到最后的结果为：8+2=10
        */
        //
        long dividend_abs = Math.abs((long)dividend);
        long divisor_abs = Math.abs((long)divisor);

        int result =0;
        while(dividend_abs >= divisor_abs)
        {
            int i = 0;
            while((divisor_abs<<i)<=dividend_abs) {
                i++;
            }
            if(i>0)
            {
                result+=1<<(i-1);
                dividend_abs-=divisor_abs<<(i-1);
            }
        }
        return answerisNeg? - result:result;
    }

}
