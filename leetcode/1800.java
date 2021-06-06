class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
         return getIntValue(firstWord) + getIntValue(secondWord) == getIntValue(targetWord);
    }
    // a method of typr int named getIntValue whose parameter is S of which is an instance of class string
    private int getIntValue(String s) {
        //declare and initialize a variable of type int
        int result = 0;
        //for loop that iterates from i=0 to last letter of s
        for(int i=0;i<s.length();i++)
            //s.charAt(i) will give the character in s at ith position. we subtract a from that character and add it with result multiplied by 10 and store it in result.u
            result = result * 10 + (s.charAt(i) - 'a');
        return result;
    }
}