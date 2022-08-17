import java.util.HashMap;

public class MaxLenSA0 {
    int maxLen(int a[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> hs=new HashMap<>();
        int currSum=0;
        int maxlen=0;
        for(int i=0;i<n;i++)
        {
            currSum+=a[i];
            if(currSum==0){
                maxlen=Math.max(i+1,maxlen);
            }
            if(hs.containsKey(currSum)){
                maxlen=Math.max(maxlen,i-hs.get(currSum));
            }
            else
                hs.put(currSum,i);
        }
        return maxlen;
    }
}
