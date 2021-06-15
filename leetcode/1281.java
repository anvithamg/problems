/*1281. Subtract the Product and Sum of Digits of an Integer
Easy
Given an integer number n, return the difference between the product of its digits and the sum of its digits.

 

Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15

Example 2:

Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21*/

class Solution {
    public int subtractProductAndSum(int n) {
        String S = Integer.toString(n);
        int product = 1; 
        int result= 0;
        int sum = 0;
        for(int i = 0;i<S.length();i++){
            int a = Character.getNumericValue(S.charAt(i));
            product = product * a;
            sum = sum + a;
        }
        result = product - sum;
        
        return result;
    }
}

class Solution {
    public int subtractProductAndSum(int n) {
        String S = Integer.toString(n);
        int product = 1; 
        int result= 0;
        int sum = 0;
        int remainder = 0;
        while(n>0) {
            remainder = n % 10;
            n = n / 10;
            sum = sum + remainder;
            product = product * remainder;
        }
        result = product - sum;
        
        return result;
    }
}