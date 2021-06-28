/*344. Reverse String
Easy

Write a function that reverses a string. The input string is given as an array of characters s.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]*/

class Solution {
    public void reverseString(char[] s) {
       // char[] rev = new char[s.length];
        for(int i=0;i<s.length/2;i++) {
            char temp = s[i];
            s[i] = s[s.length -1 - i];
            s[s.length -1 - i] = temp;
        }
    }
}
