/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        List<Integer> filledPlaces = new ArrayList<Integer>(flowerbed.length);
        int spacesBwFlowers = 0;
        int actualNumber = 0;
        for (int i = 1; i <= flowerbed.length; i++) {
            if (flowerbed[i - 1] == 1) {
                filledPlaces.add(i);
            }
        }
        if (filledPlaces.size() != 0) {
            if (filledPlaces.get(0) != 1) {
                spacesBwFlowers = filledPlaces.get(0) - 1;
                actualNumber = actualNumber + (int) (Math.floor(spacesBwFlowers / 2));
            }
            if (filledPlaces.get(filledPlaces.size() - 1) != 0) {
                spacesBwFlowers = flowerbed.length - filledPlaces.get(filledPlaces.size() - 1);
                actualNumber = actualNumber + (int) (Math.floor(spacesBwFlowers / 2));
            }
            for (int i = 1; i < filledPlaces.size(); i++) {
                spacesBwFlowers = filledPlaces.get(i) - filledPlaces.get(i - 1) - 1;
                if (spacesBwFlowers % 2 == 0) {
                    actualNumber = actualNumber + (spacesBwFlowers / 2) - 1;
                } else {
                    actualNumber = actualNumber + (int) (Math.floor(spacesBwFlowers / 2));
                }
            }
        } else {
            actualNumber = (int) Math.ceil(flowerbed.length / 2.0);
        }

        if (n <= actualNumber)
            return true;
        else
            return false;
    }
}
// @lc code=end
