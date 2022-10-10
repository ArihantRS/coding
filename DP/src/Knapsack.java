public class Knapsack {
    static int knapSack(int i,int w,int wt[],int val[] )//i index,w weight,wt weight array,val values of items
    {
        int j;
        if(w==0) return 0;
        if(i==0){
            if(wt[0]<=w)
            {
                return val[0];
            }
            else return 0;
        }
        if(wt[i]>w) return knapSack(i-1,w,wt,val);
        else
        {
            j=Math.max(val[i]+knapSack(i-1,w-wt[i],wt,val),knapSack(i-1,w,wt,val));

            return j;
        }
    }


   /* static int knapSack(int W, int wt[], int val[], int i)
    {
        if(W==0) return 0;
        if (i == 0 )
        {if(wt[i]<=W) return val[i];else return 0;}

        // If weight of the nth item is
        // more than Knapsack capacity W,
        // then this item cannot be included
        // in the optimal solution
        if (wt[i] > W)
            return knapSack(W, wt, val, i-1 );

            // Return the maximum of two cases:
            // (1) nth item included
            // (2) not included
        else
            return Math.max(val[i]
                            + knapSack(W - wt[i], wt,
                            val, i- 1),
                    knapSack(W, wt, val, i - 1));
    }*/


        public static void main(String[] args) {
        int[] wt= new int[]{1, 3, 6,5};
        int[] val=new int[]{20,30,45,40};
        int w=7;
        System.out.println(knapSack(3,w,wt,val));
    }
}
