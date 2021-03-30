package pl.miloszlewandowski.hackersRank.EasyLevel.Introduction;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            StringBuilder sb = new StringBuilder();
            double bd = b;
            double ad = a;
            double firstExpression = ad + 1 * bd;
            int intResult;
            intResult = (int) firstExpression;
            sb.append(intResult);
            if (n > 1){
                //pętla dodająca wyrażenie
                double iterationResult = firstExpression;
                for (int j = 1; j < n; j++){
                    double jd = j;
                    double expression = Math.pow(2, jd) * bd;
                    iterationResult = iterationResult + expression;
                    intResult = (int) iterationResult;
                    sb.append(" ");
                    sb.append(intResult);
                }
            }
            System.out.println(sb);
        }
        in.close();
    }
}
