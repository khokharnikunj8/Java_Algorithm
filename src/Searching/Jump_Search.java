package Searching;

/**
 * Created by nikunj on 12/5/17.
 */
public class Jump_Search {
    public static int Jump_Search(int a[],int b)
    {
        int len=a.length, previous=0;
        int increment=(int)Math.sqrt(len);
        int step=increment;
        while(a[Math.min(step,len)-1]<b)
        {
            previous=step;
            step+=increment;
            if(previous>=len)return -1;

        }
        while(a[previous]<b)
        {
            previous++;
            if(previous==Math.min(step,len))return -1;

        }
        if(a[previous]==b)return previous;
        return -1;




    }
    public static void main(String as[]){
        int a[]={1,2,5,8,66,456};
        System.out.println(Jump_Search(a,456));
    }
}
