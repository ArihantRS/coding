import java.util.ArrayList;
import java.util.Arrays;

public class BurstingBalloon {

    static public void MaxBalloon(int i,int j, ArrayList<Integer> a){
        a.add(1);
        a.add(0,1);
        System.out.println(a);
        int dp[][]=new int[j+1][j+1];
       for (int[] r:dp)
        Arrays.fill(r,-1);
        System.out.println(Max(i,j,a,dp));
    }
    static public int Max(int i,int j,ArrayList<Integer> a,int[][] dp){
        if(i>j)
            return 0;
        if(dp[i][j]!=-1)
        {
            System.out.println(" dp " + dp[i][j]); return dp[i][j];}
        int max=Integer.MIN_VALUE;
        for(int ind=i;ind<=j;ind++){
           int cost =a.get(ind)*a.get(i-1)*a.get(j+1)+Max(i,ind-1,a,dp)+Max(ind+1,j,a,dp);
            System.out.println("cost  "+cost+" ele + ind "+a.get(ind)+" "+ind);
           max=Math.max(cost,max);
            System.out.println("max "+max);

        }
        return dp[i][j]=max;
    }


    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(3);
        al.add(1);
        al.add(5);
        al.add(8);
    MaxBalloon(1,al.size(),al);
    }
}


