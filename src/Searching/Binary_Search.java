package Searching;

/**
 * Created by nikunj on 11/5/17.
 */
public class Binary_Search {
  public static int Binary_Search(int a[],int b)
  {
      int lower_bound=0,higher_bound=a.length,mid;
      while (lower_bound<=higher_bound)
      {
          mid=lower_bound+(higher_bound-lower_bound)/2;
          if(a[mid]==b)return mid;
          else if(a[mid]<b)lower_bound=mid+1;
          else if(a[mid]>b)higher_bound=mid-1;

      }
      return -1;


  }
  public static void main(String as[]){
    int a[]={1,22,32,46,75,79,81,92};
    System.out.println(Binary_Search(a,32));
  }
}
