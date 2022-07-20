import java.util.HashMap;

public class ZeroSumSA {
    public static long findSubArray(long[] arr ,int n){//Based on prefix sum and Hashing,
            long currSum=0;                             //If you get a sum that is already in the map
            long count=0;                               //it means that sub-array is getting 0 as 7+0=0
        HashMap<Long,Integer> hm=new HashMap<>();
        // HashMap<Long,Integer> h=new HashMap<>(); for printing
        //    int j=0,k=0;
        for(int i=0;i<n;i++)
        {
            currSum+=arr[i];
            if(currSum==0)
            {
                count++;
           // printSA(arr,0,i,1);
            }
            if(hm.containsKey(currSum))
            {
                count+=hm.get(currSum);
               //Say for eg you get sum 7 thrice at index 2, 4, 7 it means
                 // one 0 SA from 3-4, 2nd from 5-7, 3rd from 3-7 therefore we are adding
                                                //the no.of times we get the sum.
                hm.put(currSum,hm.get(currSum)+1);
                System.out.println("p"+hm.get(currSum));
            }
            else
            {
                hm.put(currSum,1);
         //       h.put(currSum,i+1);
            }
        }
        return count;
    }
 /*   static void printSA(long arr[],int j, int k,int value){
        while(value>=1)
        {for(int i=j;i<=k;i++)
            System.out.print(arr[i]);
        System.out.println();
        --value;}
        System.out.println();
    }*/

    public static void main(String[] args) {
        long arr[]={6,-1,-3,4,-2,2,4,6,-12,-7};
        System.out.println(findSubArray(arr, arr.length));
    }
}
