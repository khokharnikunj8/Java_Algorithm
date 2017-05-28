package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by nikunj on 11/5/17.
 */
public class Radix_Sort {
    public static void Radix_Sort(int a[])
    {

        int multiplier =1,len=a.length,max=Integer.MIN_VALUE;
        int b[]=new int[len];
        int bucket[];
        for(int i=0;i<len;i++) if(max<a[i])max=a[i];
        while(max/multiplier>0)
        {
            bucket=new int[10];
            for(int i=0;i<len;i++)bucket[(a[i]/multiplier)%10]++;
            for(int i=1;i<10;i++)bucket[i]+=(bucket[i-1]);
            for(int i=len-1;i>=0;i--)b[--bucket[(a[i]/multiplier)%10]]=a[i];
            for(int i=0;i<len;i++)a[i]=b[i];
            multiplier*=10;
        }

    }
    public static void main(String as[]){
        int a[]={1,2,3,8,4,5,23,5,4,8};
        Radix_Sort(a);
        System.out.println(Arrays.toString(a));

    }
}
