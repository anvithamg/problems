/*405. Convert a Number to Hexadecimal
Easy

Given an integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.

All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.

Note: You are not allowed to use any built-in library method to directly solve this problem.

 

Example 1:

Input: num = 26
Output: "1a"

Example 2:

Input: num = -1
Output: "ffffffff"*/
class Solution {
    public String toHex(int num) {
        if (num == 0)
            return "0";
        else if (num > 0) {
            StringBuffer ans = new StringBuffer();
            while (num > 0) {
                int rem = num % 16;
                if (rem < 10) {
                    ans.append(rem);
                } else {
                    if (rem == 10)
                        ans.append("a");
                    else if (rem == 11)
                        ans.append("b");
                    else if (rem == 12)
                        ans.append("c");
                    else if (rem == 13)
                        ans.append("d");
                    else if (rem == 14)
                        ans.append("e");
                    else
                        ans.append("f");
                }

                num = num / 16;
            }
            return ans.reverse().toString();
        } else {
            String str = Integer.toBinaryString(num);

            String s1 = str.substring(0, 4);
            String s2 = str.substring(4, 8);
            String s3 = str.substring(8, 12);
            String s4 = str.substring(12, 16);
            String s5 = str.substring(16, 20);
            String s6 = str.substring(20, 24);
            String s7 = str.substring(24, 28);
            String s8 = str.substring(28, 32);

            return toHex(Integer.parseInt(s1, 2)) + toHex(Integer.parseInt(s2, 2)) + toHex(Integer.parseInt(s3, 2))
                    + toHex(Integer.parseInt(s4, 2)) + toHex(Integer.parseInt(s5, 2)) + toHex(Integer.parseInt(s6, 2))
                    + toHex(Integer.parseInt(s7, 2)) + toHex(Integer.parseInt(s8, 2));

        }
    }
}