package Searching;

/**
 * Created by nikunj on 2/6/17.
 */
public class Interpolation_Search {
   public static int Interpolation_Search(int a[],int lower_index,int higher_index,int element){
       int pos;
       while(lower_index<=higher_index && element >=a[lower_index]&& element<=a[higher_index])
       {
               pos=(int)((double)(higher_index-lower_index)*(element-a[lower_index])/(a[higher_index]-a[lower_index]));
               if(a[pos]==element)return pos;
               else if(a[pos]>element)higher_index=pos-1;
               else lower_index=pos+1;
       }
       return -1;
   }
   public static void main(String as[]){
       int array[]={1,2,3,4,5,6,7,8,10};
       System.out.println(Interpolation_Search(array,0,8,10));

   }
}
