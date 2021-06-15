/*1832. Check if the Sentence Is Pangram
Easy

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.

Example 2:

Input: sentence = "leetcode"
Output: false*/

class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] resultArray = new boolean[26];
        for(int i=0; i<sentence.length(); i++) {
            if(sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
                resultArray[sentence.charAt(i)-'a'] = true;
            }
        }
        for(int i=0; i<26; i++){
            if(resultArray[i]==false){
                return false;
            }
        }
        return true;
    }
}
