/*204. Count Primes
Easy

Count the number of prime numbers less than a non-negative number, n.

 

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:

Input: n = 0
Output: 0

Example 3:

Input: n = 1
Output: 0*/
class Solution {
    public int countPrimes(int n) {
       int count = 0;
        int[] prime = new int[n+1];
        for(int i=0;i<=n;i++)
            prime[i] = 1; 
       for(int j=2;j<=n;j++) {
           if(prime[j]==1) {
               for(int k=2;k*j<=n;k++) {
                   prime[j*k] = 0;
               }
           }
       }
        for(int i=2;i<n;i++)
            if(prime[i]==1)
                count++;
        return count;
    }
}
