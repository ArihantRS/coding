import java.util.ArrayList;

//In its essence its basically taking an element at a particular index or not
public class PrintAllSubseq {
    static void PAS(int index, ArrayList<Integer> SS,int a[],int n){
        if(index >=n){
            System.out.println(SS);
            return;
        }
        SS.add(a[index]);
        PAS(index+1,SS,a,n);
        SS.remove(SS.size()-1);   //To not take an element
        PAS(index+1,SS,a,n);
    }

    public static void main(String[] args) {
        int a[]={3,1,2};
        ArrayList<Integer> SS=new ArrayList<>(3);
        PAS(0,SS,a,3);
    }

}
