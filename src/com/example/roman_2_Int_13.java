package com.example;

public class roman_2_Int_13 {

    public static void main(String[] args)
    {
        //System.out.println("\nRoman Number: "+romanToInt("DCCVII"));

    }
    //traditional way, which takes 8ms
    public int romanToInt(String s) {
        int length = s.length();
        int result = 0;
        char ch,next_ch;
        s+=" ";
        
        for(int i =0;i< length; i++)
        {
            ch =s.charAt(i);
            next_ch = s.charAt(i+1);
            if(ch == 'M')
            {
                result+=1000;
            }
            else if(ch =='D')
            {
                result+=500;
            }
            else if(ch =='C')
            {
                if(next_ch == 'M')
                {
                    result+= 900;
                    i++;
                }
                else if(next_ch == 'D')
                {
                    result+=400;
                    i++;
                }
                else { result +=100;}

            }
            else if(ch == 'L')
            {
               result+=50;
            }
            else if(ch == 'X')
            {
                if(next_ch == 'L')
                {
                    result+= 40;
                    i++;
                }
                else if(next_ch == 'C')
                {
                    result+=90;
                    i++;
                }
                else{ result +=10;}
            }
            else if(ch =='V')
            {
                result+=5;
            }
            else if(ch =='I')
            {
                if(next_ch == 'V')
                {
                    result+= 4;
                    i++;
                }
                else if(next_ch == 'X')
                {
                    result+=9;
                    i++;
                }
                else{ result ++;}
            }

        }

        return result;
    }
    //faster way, which take 3 ms, maybe because switch statement
    public int romanToInt2(String s){
        int nums[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'M':
                    nums[i]=1000;
                    break;
                case 'D':
                    nums[i]=500;
                    break;
                case 'C':
                    nums[i]=100;
                    break;
                case 'L':
                    nums[i]=50;
                    break;
                case 'X' :
                    nums[i]=10;
                    break;
                case 'V':
                    nums[i]=5;
                    break;
                case 'I':
                    nums[i]=1;
                    break;
            }
        }
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1])
                sum-=nums[i];
            else
                sum+=nums[i];
        }
        return sum+nums[nums.length-1];
    }
    //this one takes 4ms
    public int romanToInt3(String s) {
        int length = s.length();
        int result = 0;
        char ch,next_ch;
        s+=" ";
        for(int i = 0;i<length; i++)
        {
            ch =s.charAt(i);
            next_ch = s.charAt(i+1);
            switch (ch)
            {
                case 'M':
                    result+=1000;
                    break;
                case 'D':
                    result+=500;
                    break;
                case 'C':
                    switch(next_ch) {
                        case 'M':
                            result += 900;
                            i++;
                            break;
                        case 'D':
                            result += 400;
                            i++;
                            break;
                        default:
                            result += 100;
                    }
                    break;
                case 'L':
                    result+=50;
                    break;
                case 'X':
                    switch(next_ch) {
                        case 'L':
                            result += 40;
                            i++;
                            break;
                        case 'C':
                            result += 90;
                            i++;
                            break;
                        default:
                            result += 10;
                    }
                    break;
                case 'V':
                    result+=5;
                    break;
                case 'I':
                    switch(next_ch) {
                        case 'X':
                            result += 9;
                            i++;
                            break;
                        case 'V':
                            result += 4;
                            i++;
                            break;
                        default:
                            result += 1;
                    }
                    break;
            }
        }
        return result;
    }

}
