package com.example;

public class zigzag_Conversion_6 {
    public static void main(String[] args)
    {
        String s="DANNI KE";
        System.out.println(convert("PAYPALISHIRING", 4));
    }
    static public String convert(String s, int numRows) {
        int j =0;
        if(numRows==1) return s;
        StringBuilder sb = new StringBuilder();
        for(int i =0; i <numRows;i++){
            j=i;
            while(j<s.length())
            {
                sb.append(s.charAt(j));
                j+=2*(numRows-i-1);
                //if not the first row and last row
                if(i!=numRows-1 && i!=0 &&j<s.length())
                {
                    sb.append(s.charAt(j));
                }
                j+=2*i;
                //the j here will add 2*0 in frist time and add number in final row
            }
        }
        return sb.toString();
    }
}
