/*709. To Lower Case
Easy

Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"

Example 2:

Input: s = "here"
Output: "here"

Example 3:

Input: s = "LOVELY"
Output: "lovely"*/

class Solution {
    public String toLowerCase(String s) {
        String lower = new String();
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)>='A'&& s.charAt(i)<='Z'){
                lower += (char)((int)s.charAt(i) + 32);
            }
            else
                lower += s.charAt(i);
        }
        return lower;
    }
}
