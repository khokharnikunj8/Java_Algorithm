package Searching;

/**
 * Created by nikunj on 11/5/17.
 */
public class Linear_Search {
  public static int Linear_Search(int a[],int b)
  {
    //if element b found return position else return -1
      int len=a.length;
      for(int i=0;i<len;i++)
      {
          if(a[i]==b)return i;
      }
      return -1;
  }
  public static void main(String as[]){
        int a[]={1,2,3,4,9,51,54,65,45,77};
        System.out.println(Linear_Search(a,54));
  }
}
