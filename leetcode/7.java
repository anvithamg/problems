/*7. Reverse Integer
Easy

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321

Example 3:

Input: x = 120
Output: 21

Example 4:

Input: x = 0
Output: 0*/

class Solution {
    public int reverse(int x) {
        int num = x;
        int rev=0;
        int r;
        x = Math.abs(x);
        while(x>0) {
            if(rev>Integer.MAX_VALUE/10)
            return 0;
            r = x % 10;
            rev = rev * 10 +r;
            x = x / 10;
        }
        if(num<0)
            return -rev;  
        return rev;
        
    }
}
