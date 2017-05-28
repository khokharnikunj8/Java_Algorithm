package Sorting;

import java.util.Arrays;

/**
 * Created by nikunj on 5/5/17.
 */
public class Selection_Sort {

   private static void Selection_sort(int a[])
   {
      int len=a.length,pos;
      for(int i=0;i<len;i++)
      {
         pos=i;
         //check for lowest value from i+1
         for(int j=i+1;j<len;j++)
         {
            if(a[pos]>a[j])pos=j;
         }
         if(pos!=i)
         {
            //exchange the values.
            a[pos]=a[i]+a[pos]-(a[i]=a[pos]);
         }

      }

   }
   public static void main(String as[])
   {
      int a[]={10,30,20,10,25,12};
      Selection_sort(a);
      System.out.println(Arrays.toString(a));
   }
}
