package pl.miloszlewandowski.hackersRank.EasyLevel.bigNumber;

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {

    //TODO: JavaBigDecimal
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        String[] x = Arrays.copyOf(s, n);
        Arrays.sort(x, Collections.reverseOrder(Comparator.comparing(BigDecimal::new)));
        s = x;

        for(int i=0;i<n;i++) {
            System.out.println(s[i]);
        }
    }
}