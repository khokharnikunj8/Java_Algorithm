package Backtracking;

import java.util.*;

/**
 * Created by nikunj on 12/5/17.
 */
public class Permutation_String {

    public static HashSet<String> permutation_string=new HashSet<String>();
    public static void Permutation_String(char a[],int lower_bound,int upper_bound)
    {
        if(lower_bound==upper_bound)permutation_string.add(String.valueOf(a));

        for(int i=lower_bound;i<=a.length-1;i++)
        {
            swap(a,lower_bound,i);
            Permutation_String(a,lower_bound+1,upper_bound);
            swap(a,lower_bound,i);
        }


    }
    public static void swap(char a[],int b,int c)
    {
        char temp=a[b];
        a[b]=a[c];
        a[c]=temp;

    }


    public static void main(String as[]){
        String s="abc";
        char a[]=s.toCharArray();
        Permutation_String(a,0,a.length-1);

        System.out.println(permutation_string);

        /*for sorted permutation list ,

        List<String>ls=new ArrayList(permutation_string);
        Collections.sort(ls, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println(ls);
        */

   }
}
