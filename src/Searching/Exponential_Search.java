package Searching;

/**
 * Created by nikunj on 12/5/17.
 */
public class Exponential_Search {
    public static int Exponential_Search(int a[],int  b)
    {
            if(a[0]==b)return 0;
            int pos=1;
            while(pos<a.length&&a[pos]<b)
            {
                pos*=2;

            }
            return Binary_Search(a,pos/2,pos,b);
    }
    public static int Binary_Search(int a[],int lower_bound,int upper_bound,int b)
    {
        int mid;
        while(lower_bound<=upper_bound)
        {
            mid=lower_bound+(upper_bound-lower_bound)/2;
            if(a[mid]==b)return mid;
            else if(a[mid]>b)
            {
                upper_bound=mid-1;
            }
            else
            {
                lower_bound=mid+1;

            }
        }

        return -1;
    }
    public static void main(String as[]){
            int a[]={1,2,3,4,56,78,99};
            System.out.println(Exponential_Search(a,56));
    }
}
