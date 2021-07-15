/*28. Implement strStr()
Easy

Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

Example 3:

Input: haystack = "", needle = ""
Output: 0

*/
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;
        if (haystack.length() < needle.length())
            return -1;
        char[] ch = haystack.toCharArray();
        char[] ch1 = needle.toCharArray();
        for (int i = 0; i <= ch.length - ch1.length; i++) {
            int j;
            for (j = 0; j < ch1.length; j++) {
                if (ch1[j] != ch[i + j]) {
                    break;
                }
            }

            if (j == ch1.length) {
                return i;
            }
        }
        return -1;
    }
}
