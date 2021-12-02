/*1748. Sum of Unique Elements
Easy

You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

 

Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.

Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
*/
class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int flag = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;
                if (nums[i] != nums[j]) {
                    continue;
                } else {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                sum = sum + nums[i];
        }
        return sum;
    }
}