/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.*/

import java.util.HashSet;

public class Prog1 {
    public static int findDuplicate(int nums[]) {
       // int repeated = -1,flag=0, i;
        HashSet<Integer> set = new HashSet<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }

        }
        return len;

                /*for(int j=i+1;j<nums.length;j++)      brute force
                    if ((nums[i] ^ nums[j]) == 0) {
                        repeated = nums[i];
                        flag=1;
                        break;
                    }
                if(flag==1)
                    break;*/
    }

    public static void main(String[] args) {
        int a[]={3,1,3,2,3};

        System.out.println(findDuplicate(a));
    }
}
