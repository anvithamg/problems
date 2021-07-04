/*242. Valid Anagram
Easy

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false*/
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] s1 = new char[s.length()];
        char[] t1 = new char[t.length()];
        s1 = s.toCharArray();
        t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] != t1[i])
                return false;
        }
        return true;
    }
}
