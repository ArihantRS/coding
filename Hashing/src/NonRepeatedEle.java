import java.util.HashMap;
import java.util.Map;

public class NonRepeatedEle {
    public static void NRE(int a[],int n){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<n;i++){
            hm.put(a[i], hm.getOrDefault(a[i],0)+1);
        }
        int c=0;
        for (Map.Entry<Integer,Integer> s:hm.entrySet())
            if(s.getValue()<2)
            c++;
        System.out.println(c);
    }

    public static void main(String[] args) {
        int[] a={1,1,2,2,3,3,4,5,6,7};
    NRE(a, a.length);
    }
}
