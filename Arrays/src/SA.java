import java.util.ArrayList;

public class SA {
    static ArrayList<Integer> SASum(int[] arr, int n, int s)
    {
        ArrayList<Integer> al=new ArrayList<>();
        int sum=0;
        int i=0,j=0;
        while(i<n && j<n){
            sum+=arr[j];
            if(sum==s){
                al.add(i+1);
                al.add(j+1);
             //   System.out.println(sum);
                return al;
            }
            else if(sum<s){
                j++;
           //     System.out.println("k"+sum);
            }
            else if(sum >s){
                i++;
                j=i;
                sum=0;
         //       System.out.println("l"+sum);
            }
        }

        return al;

    }

    public static void main(String[] args) {
      int A[] = {1,2,3,7,5};
        System.out.println( SASum(A,A.length,12));
    }
}
