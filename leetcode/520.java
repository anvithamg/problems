/*520. Detect Capital
Easy

We define the usage of capitals in a word to be right when one of the following cases holds:

    All letters in this word are capitals, like "USA".
    All letters in this word are not capitals, like "leetcode".
    Only the first letter in this word is capital, like "Google".

Given a string word, return true if the usage of capitals in it is right.

 

Example 1:

Input: word = "USA"
Output: true

Example 2:

Input: word = "FlaG"
Output: false*/
class Solution {
    public boolean detectCapitalUse(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                if (Character.isUpperCase(word.charAt(i + 1))) {
                    for (int j = 0; j < word.length(); j++) {
                        if (Character.isLowerCase(word.charAt(j)))
                            return false;
                    }
                    return true;
                } else {
                    for (int j = 1; j < word.length(); j++) {
                        if (Character.isUpperCase(word.charAt(j)))
                            return false;
                    }
                    return true;
                }
            }
            if (Character.isLowerCase(word.charAt(i))) {
                for (int j = 0; j < word.length(); j++) {
                    if (Character.isUpperCase(word.charAt(j)))
                        return false;
                }
                return true;
            }
        }
        return true;
    }
}
