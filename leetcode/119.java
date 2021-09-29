/*119. Pascal's Triangle II
Easy

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

 

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]

Example 2:

Input: rowIndex = 0
Output: [1]

Example 3:

Input: rowIndex = 1
Output: [1,1]
*/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalsTriangle = new ArrayList<List<Integer>>();
        List<Integer> t = new ArrayList<Integer>();
        t.add(1);
        pascalsTriangle.add(t);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> ans = new ArrayList<Integer>();
            List<Integer> previous = pascalsTriangle.get(i - 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    ans.add(1);
                else {
                    ans.add(previous.get(j - 1) + previous.get(j));
                }
            }
            pascalsTriangle.add(ans);
        }
        List<Integer> row = pascalsTriangle.get(rowIndex);
        return row;
    }
}