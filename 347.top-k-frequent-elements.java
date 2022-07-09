/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap();
        int[] result = new int[k];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        pQueue.addAll(map.keySet());

        for (int i = 0; i < k; i++) {
            result[i] = pQueue.remove();
        }

        return result;
    }
}
// @lc code=end
