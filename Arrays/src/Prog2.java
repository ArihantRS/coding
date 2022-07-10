/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
such that each unique element appears only once. The relative order of the elements should be
kept the same.
Since it is impossible to change the length of the array in some languages, you must instead
 have the result be placed in the first part of the array nums. More formally, if there are k
 elements after removing the duplicates, then the first k elements of nums should hold the final result.
 It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.*/

public class Prog2 {
    public static int removeDuplicates(int[] nums) {

            int i=0,j;
            for(j=1;j<nums.length;j++){
                if(nums[i]!=nums[j]){ //As long as duplicate is there it will skip over those
                    nums[++i]=nums[j];//when non-duplicate is found it will be replaced in the array.
                }}
            return i+1;

    }

    public static void main(String[] args) {
        int a[]={-2,-1,0};
        System.out.println("\t"+removeDuplicates(a));
    }
}
