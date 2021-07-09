/*349. Intersection of Two Arrays
Easy

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.*/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();// Creating an integer set by calling Hashset(which stores elements in hash
                                           // table and can be accessed using hashing)

        for (int i : nums1) {
            set.add(i);// adding elements of nums1 to set uniquely
        }

        Set<Integer> intersection = new HashSet<>(); // creating another set called intersection

        for (int j : nums2) {
            if (set.contains(j)) {// set.contains returns true if the element is present in set
                intersection.add(j); // adding the element to intersection.(Hashset holds only unique elements,but in
                                     // random order)
            }
        }

        int[] res = new int[intersection.size()];// An array of type int
        int k = 0;
        for (Integer i : intersection) {
            res[k++] = i;// Adding elements of intersection set to res
        }

        return res;
    }
}
