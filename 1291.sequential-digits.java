/*
 * @lc app=leetcode id=1291 lang=java
 *
 * [1291] Sequential Digits
 */

// @lc code=start
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> allNumbers = new ArrayList<Integer>();
        int sizeLow = String.valueOf(low).length();
        int sizeHigh = String.valueOf(high).length();

        for (int i = sizeLow; i <= sizeHigh; i++) {
            for (int j = 0; j < 10 - i; j++) {
                int num = Integer.parseInt(digits.substring(j, j + i));
                if (num >= low && num <= high) {
                    allNumbers.add(num);
                }
            }
        }

        /*
         * int temp = 0;
         * while(low <= high){
         * temp = low;
         * while((temp % 10 == ((temp/10)%10)+1)){
         * temp = temp/10;
         * }
         * System.out.println(temp);
         * if(temp < 10){
         * allNumbers.add(low);
         * }
         * low++;
         * }
         */

        return allNumbers;
    }
}
// @lc code=end
