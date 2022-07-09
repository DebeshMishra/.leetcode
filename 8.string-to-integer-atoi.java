/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        char sign = ' ';
        int firstDigit = 0;
        StringBuilder finalNumberStr = new StringBuilder(s.length());
        StringBuilder firstHalf = new StringBuilder(s.length());
        int finalNumber = 0;
        Boolean logicFlag = false;
        for (int i = 0; i < s.length(); i++) {
            Boolean flag = Character.isDigit(s.charAt(i));
            if (flag) {
                if (i != 0)
                    sign = s.charAt(i - 1);
                firstDigit = i;
                logicFlag = true;
                break;
            }
        }
        if (firstDigit != 0) {
            for (int i = 0; i < firstDigit; i++) {
                firstHalf.append(s.charAt(i));
            }
        }

        if (firstHalf.length() != 0 && (firstHalf.charAt(firstHalf.length() - 1) == '-'
                || firstHalf.charAt(firstHalf.length() - 1) == '+')) {
            firstHalf.deleteCharAt(firstHalf.length() - 1);
        }

        if (!isStringAllWhiteSpace(firstHalf.toString())) {
            logicFlag = false;
        }

        if (logicFlag) {
            for (int i = firstDigit; i < s.length(); i++) {
                Boolean flag = Character.isDigit(s.charAt(i));
                System.out.println(s.charAt(i));
                if (flag) {
                    finalNumberStr.append(s.charAt(i));
                } else {
                    break;
                }
            }
            if (sign == '-') {
                if (-Double.parseDouble(finalNumberStr.toString()) <= -2147483648)
                    finalNumber = -2147483648;
                else {
                    finalNumber = -Integer.parseInt(finalNumberStr.toString());
                }
            } else {
                if (Double.parseDouble(finalNumberStr.toString()) > 2147483647)
                    finalNumber = 2147483647;
                else {
                    finalNumber = Integer.parseInt(finalNumberStr.toString());
                }
            }
        }
        return finalNumber;
    }

    public static boolean isStringAllWhiteSpace(String str) {

        // Remove the leading whitespaces using trim()
        // and then check if this string is empty
        if (str.trim().isEmpty())
            return true;
        else
            return false;
    }
}
// @lc code=end
