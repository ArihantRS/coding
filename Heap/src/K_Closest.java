import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair
{
    Integer key, diff;
    Pair(Integer d,Integer k) //difference parameter first as by default elements are ordered by their first parameter
    {
        this.key=k;
        this.diff=d;
    }
}
public class K_Closest {
    static void KCl(int a[],int k,int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                //   System.out.println("QWER "+o1.diff.compareTo(o2.diff));
                return o1.diff.compareTo(o2.diff);
            }
        }));
        for (int i = 0; i < k; i++) {
            pq.offer(new Pair(Math.abs(a[i] - x),i));
        }
        for (Pair u:pq)
            System.out.println("PP "+ a[u.key]);
        for (int i = k; i < a.length; i++) {
            int diff = Math.abs(a[i] - x);
            assert pq.peek() != null;
            //System.out.println(diff+"dif");
           // System.out.println(a[pq.peek().key]+"peek");
            if (pq.peek().diff > diff) {
                pq.poll();
                pq.offer(new Pair( diff,i));
            }
            for (Pair u:pq) {
                System.out.println("PP "+ u.key);
            }

        }
        while (!pq.isEmpty()) {
            System.out.println(a[pq.poll().key]);
        }
    }

    public static void main(String[] args) {
        int a[]={ 30,4,32,40,36,37};
        KCl(a,3,38);
    }
}

/*class K_Closest
{
    Integer key;
    Integer value;

    public K_Closest(Integer key, Integer value)
    {
        this.key = key;
        this.value = value;
    }
    public Integer getKey()
    {
        return key;
    }
    public void setKey(Integer key)
    {
        this.key = key;
    }
    public Integer getValue()
    {
        return value;
    }
    public void setValue(Integer value)
    {
        this.value = value;
    }
    public static void main (String[] args)
    {
        int arr[] = { 10,30,5,40,38,80,70 };

        int size = arr.length;

        int x=35; int k = 3;



        GFG o=new GFG();
        o.printKClosest(arr,size,k,x);
    }
}
class GFG{

    public void printKClosest(int arr[], int n, int k, int x)
    {
        PriorityQueue<K_Closest> pq = new PriorityQueue<>(
                new Comparator<K_Closest>()
                {
                    public int compare(K_Closest p1, K_Closest p2)
                    {
                        return p2.getValue().compareTo(
                                p1.getValue());
                    }
                });

        for(int i = 0; i < k; i++)
        {
            pq.offer(new K_Closest(arr[i],
                    Math.abs(arr[i] - x)));
        }

        for(int i = k; i < n; i++)
        {
            int diff = Math.abs(arr[i] - x);

            if(pq.peek().getValue()>diff) {
                pq.poll();
                pq.offer(new K_Closest(arr[i], diff));
            }
        }

        while(!pq.isEmpty())
        {
            System.out.print(pq.poll().getKey() + " ");
        }
    }


}*/
