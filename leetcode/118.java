/*118. Pascal's Triangle
Easy

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

 

Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:

Input: numRows = 1
Output: [[1]]*/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<List<Integer>>();
        List<Integer> t = new ArrayList<Integer>();
        t.add(1);
        pascalsTriangle.add(t);
        for (int i = 1; i < numRows; i++) {
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
        return pascalsTriangle;
    }
}
