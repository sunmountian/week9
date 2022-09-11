package com.week9;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 09
 */
public class IsPalindrome {
    class Solution {
        public boolean isPalindrome(int x) {
            //如果是负数则一定不是回文数，直接返回 false
            if (x < 0)
                return false;
            //如果是正数，则将其倒序数值计算出来，然后比较和原数值是否相等
            int cur = 0;
            int num = x;
            while (num != 0){
                cur = cur * 10 + num % 10;
                num /= 10;
            }
            return cur == x;
        }
    }
}
