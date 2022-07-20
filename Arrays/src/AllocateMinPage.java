public class AllocateMinPage //Binary search
 {
     public static int AMP(int[] a,int n,int m) {
         int max = 0;
         int min = 0;
         for (int i : a) {
             max += i;
             min = Math.max(min, i);
         }
         int high = max, low = min;
         int res = 0;
         while (high >=low) {
             int mid = (high + low) / 2;
             if (isFeasible(a,n,m,mid))
             {
                 res=mid;
                 high=mid-1;
             }
             else low=mid+1;
         }
         return res;
     }
     public static boolean isFeasible(int[] a,int n,int m,int mid){
         int students=1,sum=0;
         for (int i=0;i<n;i++){
             if(sum+a[i]>mid){
                 students++;sum=a[i];
             }
             else sum+=a[i];
         }
         return (students<=m);
     }
     public static void main(String[] args) {
         int a[]={10,20,10,30};
         System.out.println(AMP(a,4,2));
     }
}
