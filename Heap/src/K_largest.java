import java.util.PriorityQueue;

public class K_largest {
    static void K_la(int a[],int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++)        //Maintaining a heap of k elements TC=THeta(k)
            pq.add(a[i]);
        for(int i=k;i<a.length;i++)         //TC=O(n-k)logk as log k time neede to traverse a tree of height k
            if(a[i]>pq.peek())  //The root of the heap would be smallest of the k-ele heap
            {pq.poll();         //So if next element is bigger than root then root will be popped from heap
                pq.add(a[i]);}  //And the bigger ele added


        for(int j=0;j<k;j++)
            System.out.println(pq.poll());
    }

    public static void main(String[] args) {
        int a[]={5,15,20,8,10,25,18};
        K_la(a,3);
    }
    //TC=O(k+(n-k)logK)
}
