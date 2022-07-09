/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int idx1 = m - 1, idx2 = n - 1, ans = m + n - 1; idx1 >= 0 || idx2 >= 0;) {
            if (idx2 < 0)
                break;

            if (idx1 >= 0 && nums1[idx1] > nums2[idx2]) {
                nums1[ans] = nums1[idx1];
                idx1--;
            } else {
                nums1[ans] = nums2[idx2];
                idx2--;
            }
            ans--;
        }

        /*
         * for(int i=m, j=0;i<(m+n) && j<n;i++, j++){
         * nums1[i]=nums2[j];
         * }
         * 
         * Arrays.sort(nums1);
         */
    }
}
// @lc code=end
