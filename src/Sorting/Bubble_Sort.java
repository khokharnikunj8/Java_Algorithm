package Sorting;

import java.util.Arrays;

/**
 * Created by nikunj on 5/5/17.
 */
public class Bubble_Sort {
    public static void Bubble_Sort(int a[]){
        int len=a.length;
        for(int i=len-1;i>=0;i--)
        {

            for(int j=0;j<i;j++)
            {
                if(a[j]>a[j+1])
                {
                    //swap the values
                    a[j]=a[j+1]+a[j]-(a[j+1]=a[j]);
                }
            }
        }

    }
    public static void main(String as[])
    {
            int a[]={4,5,7,5,4,2,4,54,2,4,5,1};
            Bubble_Sort(a);
            System.out.println(Arrays.toString(a));
    }
}
