/*1470. Shuffle the Array
Easy

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

 

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Example 2:

Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

Example 3:

Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]

 nums = [1,2,3,4,4,3,2,1], n = 4
 results[] = {1,4,2,3,3,2,4,1}
 k=0
 for i = 0 to n-1:
 	result[k] = nums[i]
 	k = k+2
k=1
for j=n to (2*n)-1
    result[k] = nums[j]
    k = k+2

nums = [1,1,2,2], n = 2
results[] = {1,2,1,2}*/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int k = 0;
        for(int i = 0;i<=n-1;i++)
        {
            result[k]=nums[i];
            k+=2;
        }
        k=1;
        for(int j = n;j<=(2*n)-1;j++){
            result[k]=nums[j];
            k+=2;
        }
        return result;
    }
}

class Solution2 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int j = 0;
        int k = n;
        boolean flag = true;
        for (int i = 0; i < 2*n; ++i) {
            if (flag) {
                result[i] = nums[j++];
                flag = !flag;
            }
            else {
                result[i] = nums[k++];
                flag = !flag;
            }
        }
        return result;
    }
}