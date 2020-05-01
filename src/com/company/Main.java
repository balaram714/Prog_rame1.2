package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        for(int i=0;i<t;i++)
        {
            String s=obj.next();
            int count=0;
            for(int j=0;j<s.length();j++)
            {
                for(int k=0;k<s.length();k++)
                {
                    if(s.charAt(k)<s.charAt(j))
                    {
                        count++;
                        break;
                    }
                }
                if(count==1)
                    break;
            }
            if(count==1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
