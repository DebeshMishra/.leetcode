/*
 * @lc app=leetcode id=881 lang=java
 *
 * [881] Boats to Save People
 */

// @lc code=start
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int first = 0;
        int last = people.length - 1; // pairing for each boat

        while (first <= last) {
            if (people[first] + people[last] <= limit)
                first++;
            last--;
            boats++;
        }

        return boats;
    }
}
// @lc code=end
