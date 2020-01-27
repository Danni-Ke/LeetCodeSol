package com.example;

public class reverse_Integer_7 {
    public static void main(String[] args) {
        int num = 1234;

        //System.out.println("Reversed Number: " + reverse(1234));
    }

    public int reverse(int x) {
        //reverse may overflow, answer need to be checked,still we assume the given input is not overflow
        //long数据类型范围是-9,223,372,036,854,775,808至9,223,372,036,854,775,807(-2^63至2^63-1), so the answer should use the long type
        long answer = 0;
        //int digit =0;
        while(x!=0)
        {
            //digit = x%10;
            answer = answer*10 + x%10;
            x = x/10;
        }
        if(answer> Integer.MAX_VALUE|| answer< Integer.MIN_VALUE )
        {
            return 0;
        }
        return (int)answer;
    }
}
