//Complete Binary tree
//Left child 2i+1
//Right child 2i+2
//Parent of a child node floorOf(i-1/2)


// Min Heap
//Every node should have value smaller than its descendant
//Internally represented as an array

public class BinaryHEap     //MinHeap
{
int arr[],size,capacity; //size is no. of elements in min heap
BinaryHEap(int c){
    this.capacity=c;
    arr=new int[capacity];
    size=0;
}
int left(int a[],int i){
    return a[(2*i)+1];
}
int right(int a[],int i){
    return a[2*i+2];
}
static int node(int[] a,int i){
    double node=(i-1)/2;
    return a[(int)Math.floor(node)];
}
static int insert(int[] a,int ele)//Swapping with the parent node if the value of parent node is greater
{
    int size=a.length;
    int i=size;
    a[i-1]=ele;
    int j=(int)Math.floor((i-1)/2);
    while(ele<a[j])
    {
     j=i^j;
     i=i^j;
     j=(int)Math.floor((i-1)/2);
    }
return i;
}

    public static void main(String[] args) {
        int a[]={10,20,15,40,50,100,25,45};
        System.out.println(node(a,3));
        System.out.println(insert(a,39));
    }
}
