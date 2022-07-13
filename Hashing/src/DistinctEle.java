import java.util.HashSet;

public class DistinctEle {

    public static void naive(int[] a){
        int c=0;
        for (int i=0;i<a.length;i++) {
            boolean flag = true;
            for (int j=i+1;j<a.length;j++) {    //will be returning true only at the last occurrence
            if (a[i] == a[j]) {                 //of the element
                    flag = false;
                    break;
                }
            }
            if (flag)
                c++;
        }
        System.out.println("Distinct elements "+c);

    }
    public static void Hash(int[] a){
        HashSet<Integer> hs=new HashSet<>();
            for(int aa:a)
                hs.add(aa);
        System.out.println("Distinct elements(hash) "+hs.size());

    }

    public static void main(String[] args) {
        int[] a ={1,2,1,2,3,3,4,5,6,7,7,8,6,8,9};
        naive(a);
        Hash(a);
    }
}
