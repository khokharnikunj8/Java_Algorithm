package Searching;

/**
 * Created by nikunj on 12/5/17.
 */
public class Ternary_Search {
    public static int Ternary_Search(int a[],int b)
    {
        int mid1,mid2;
        int lower_bound=0,upper_bound=a.length;
        while(lower_bound<=upper_bound)
        {
            mid1=lower_bound+(upper_bound-lower_bound)/3;
            mid2=mid1+(upper_bound-lower_bound)/3;
            if(a[mid1]==b)return mid1;
            if(a[mid2]==b)return mid2;
            if(a[mid1]>b)
            {
                upper_bound=mid1-1;
            }
            else if(b>a[mid2])
            {
                lower_bound=mid2+1;
            }
            else
            {
                upper_bound=mid2-1;
                lower_bound=mid1+1;
            }
         //   System.out.print(mid1+" "+mid2+"\n");


        }
        return -1;
    }
    public static void main(String as[]){
        int a[]={1,5,65,85,99,199};
        System.out.println(Ternary_Search(a,99));
    }
}
