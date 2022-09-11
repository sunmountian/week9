package com.week9;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 14
 */
public class LongestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            //如果输入的strs为空，则返回空字符串""
            if (strs.length == 0) {
                return "";
            }
            //定义一个ans为strs[0],获取到strs的第一个字符串为了一下面的循环比较
            String ans = strs[0];
            for (int i = 1; i < strs.length; i++) {
                //在这里定义j=0，而不是在for里面定义；是为了ans.substring(0,j)能调用j的值
                int j = 0;
                for (; j < ans.length() && j < strs[i].length(); j++) {
                    //比较俩个字符串相同的部分，不相同则退出循环
                    if (ans.charAt(j) != strs[i].charAt(j))
                        break;
                }
                //获取从0到j相同的字符串
                ans = ans.substring(0, j);
                //如果ans获取的结果为空则返回空字符
                if (ans.equals(" "))
                    return ans;
            }
            //返回最终获取到的ans
            return ans;

        }
    }
}
