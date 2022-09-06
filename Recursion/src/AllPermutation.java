

public class AllPermutation {

    static void perm(int l,int a[],int r){
        int c=0;
        if (l==r){
            for(int i=0;i<r;i++)
            System.out.print(a[i]+",");
            System.out.println();}
        else{
            for(int i=l;i<r;i++)
            {
                swap(a,l,i);// swapping one index with another
                perm(l+1,a,r);
                swap(a,l,i); //Backtracking
            }
        }
    }
    static void swap(int a[],int i,int j){
     int temp;
     temp=a[i];
     a[i]=a[j];
     a[j]=temp;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        perm(0,a,4);
    }
}
