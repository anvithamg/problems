/*
58. Length of Last Word
Easy

Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5

Example 2:

Input: s = " "
Output: 0


*/

class Solution {
    public int lengthOfLastWord(String s) {
        // Below statement is to split the words and store it in a string array
        String[] splits = s.split(" ");
        // If the word length not less than 1(i.e., no words) then return 0
        if (splits.length < 1)
            return 0;
        // !!!!! Take last wor(length - 1) then return it's length
        return splits[splits.length - 1].length();
    }
}