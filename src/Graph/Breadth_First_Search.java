package Graph;

import java.util.*;

/**
 * Created by nikunj on 14/5/17.
 */
public class Breadth_First_Search {
    public static LinkedList<Integer> Breadth_First_Search(LinkedList<Integer>edges[],int vertex,int vertex_total)
    {
        int temp_edge;
        LinkedList<Integer>transversal=new LinkedList<Integer>();
        boolean visited[]=new boolean[vertex_total+1];
        LinkedList<Integer> queue = new<Integer> LinkedList();
        visited[vertex]=true;
        queue.add(vertex);

        while(!queue.isEmpty())
        {

            temp_edge=queue.removeFirst();

            transversal.add(temp_edge);

            for(int i=0;i<edges[temp_edge].size();i++)
            {
                if(!visited[edges[temp_edge].get(i)])
                {
                    visited[edges[temp_edge].get(i)]=true;
                    queue.add(edges[temp_edge].get(i));
                }
            }
        }
        return transversal;


    }
    public static void main(String as[]){
        int vertex=6;
        LinkedList<Integer>edges[]=new LinkedList[vertex+1];
        for(int i=0;i<=vertex;i++)edges[i]=new LinkedList<Integer>();
        int edge=6;

        //index is 1-based
        //adding edge to edges
        edges[1].add(3);
        edges[1].add(4);
        edges[3].add(2);
        edges[4].add(5);
        edges[4].add(2);
        edges[5].add(6);
        System.out.println(Breadth_First_Search(edges,1,vertex));



    }
}
