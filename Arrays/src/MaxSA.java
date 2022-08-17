public class MaxSA {

    static int maxSA(int a[],int n){
        int max=a[0],res=a[0];
        for(int i=1;i<n;i++){
            max=Math.max(max+a[i],a[i]);//Maxsum upto an index will be max sum before that index + element or the element itself
            res=Math.max(max,res); //updating the max result every time max sum is found
        }
        return res;
    }

    public static void main(String[] args) {
        int a[]={-1,-2,-3,-4};
        System.out.println(maxSA(a,4));
    }
}
