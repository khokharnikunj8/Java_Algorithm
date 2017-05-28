package Sorting;

import java.util.Arrays;

/**
 * Created by nikunj on 5/5/17.
 */
public class Insertion_Sort {
   public static void Insertion_Sort(int a[]){
        int len=a.length,pos,temp;
        for(int i=1;i<len;i++)
        {
            pos=i;
            temp=a[i];
            while(pos>0&&a[pos-1]>temp)
            {
                a[pos]=a[pos-1];
                pos--;
            }
            if(pos!=i)
            {
                //assign the value
                a[pos]=temp;
            }

        }
   }
   public static void main(String as[])
   {
       int a[]={10,5,6,4,7,2,8,1,9,3};
       Insertion_Sort(a);
       System.out.println(Arrays.toString(a));
   }
}
