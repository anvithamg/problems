/*125. Valid Palindrome
Easy

Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
*/
class Solution {
    public boolean isPalindrome(String s) {
        char[] s1 = s.toCharArray();
        int i = 0;
        int j = s1.length - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit((s1[i])))
                i++;
            else if (!Character.isLetterOrDigit((s1[j])))
                j--;
            else {
                if (Character.toUpperCase(s1[i++]) != Character.toUpperCase(s1[j--]))
                    return false;
            }
        }
        return true;

    }
}
