/*14. Longest Common Prefix
Easy

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.*/
public String longestCommonPrefix(String[] strs) {
    StringBuilder ans = new StringBuilder();
    for(int i = 0;i<strs[0].length();i++){
        boolean flag = true;
        for(int j = 1;j<strs.length;j++){
            if(i<strs[j].length()&&strs[j].charAt(i)==strs[0].charAt(i))
                continue;
            else{
                flag = false;
                break;
            }
        }
        if(flag == true)
            ans.append(strs[0].charAt(i));
        else
            break;
    }
    return ans.toString();
}
}

