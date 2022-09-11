package com.week9;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @authoe 李祥基
 * leetcode 01
 */
public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //暴力解法
            //时间复杂度：O(N^2)其中N是数组中的元素数量。最坏情况下数组中任意两个数都要被匹配一次。
            //空间复杂度：O(1)
           /* for(int i = 0 ; i < nums.length ; i++){
                for(int j = i + 1 ; j < nums.length ;j++){
                    if((nums[i]+nums[j])==target)
                        return new int[] {i,j};
                }
            }
            return null;*/

            //哈希表
            //时间复杂度：O(N)，其中N是数组中的元素数量。对于每一个元素 x，我们可以 O(1)O(1) 地寻找 target - x。
            //空间复杂度：O(N)，其中N是数组中的元素数量。主要为哈希表的开销。
            Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (hashtable.containsKey(target - nums[i]))
                    return new int[]{i, hashtable.get(target - nums[i])};
                hashtable.put(nums[i], i);
            }
            return null;

        }
    }
}
