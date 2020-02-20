package com.example;

public class count_and_say_38 {
    public static  void main(String[] args)
    {
        //System.out.println(countAndSay(5));
    }
    //method 1: too slow
    public String countAndSay(int n) {
        if(n==1)  return "1";
        String answer = "1";
        for(int i =1 ; i< n;i++)
        {
            answer = update(answer);
            //System.out.println(answer);

        }
        return answer;
    }
    public String update(String str)
    {
        str+="#";
        char currentChar = str.charAt(0);
        int count=1;
        String newstr="";
        for(int i=1;i<str.length();i++ )
        {
            if(currentChar == str.charAt(i))
            {
                count++;
            }
            else
            {
                currentChar = str.charAt(i);
                newstr += Integer.toString(count);
                newstr += str.charAt(i-1);
                count = 1;

            }
        }
        return newstr;
    }


    public String countAndSay2(int n)
    {
        String num = "1";
        for(int m = 1; m<n ; m++ ){
            num = getString(num);
        }
        return num;
    }
    public String getString(String num){
        StringBuffer result = new StringBuffer();
        int j = 0 , i = 0 , n = 0;
        while( i< num.length()){
            char ch = num.charAt(i);
            while( j < num.length() && ch == num.charAt(j) )
                j++;
            n = j - i;
            result.append(n).append(ch-'0');
            i = j;
        }
        return result.toString();
    }
}
