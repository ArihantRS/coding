//A particular no. can be anywhere between i-k to i+k
//eg-for the smallest no. i=0, therefore it can be anywhere between 0 to k;

import java.util.PriorityQueue;

public class K_Sorted__Array {

    static void Ksort(int a[],int k){
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<=k;i++)//for 0th index the maximum index that it can occur at is k-1;
            pq.add(a[i]);   //therefore adding all elements till k
        int index=0;
        for(int j=k+1;j<a.length;j++)
        {
            a[index++]=pq.poll();       //in the first iteration we will get the 0th index ele
            pq.add(a[j]);               //and also 1st index element will be added to the heap if not till now
        }
        while(!pq.isEmpty()){
            a[index++]=pq.poll();
        }
       for (int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }

    public static void main(String[] args) {
        int a[]={9,8,7,19,18};
        int k=2;
        Ksort(a,k);
    }
    //Tc= O((n+k)logk)

}
