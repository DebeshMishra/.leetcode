/*
 * @lc app=leetcode id=729 lang=java
 *
 * [729] My Calendar I
 */

// @lc code=start
class MyCalendar {

    HashMap<Integer, Integer> map;

    public MyCalendar() {
        map = new HashMap<>();
    }

    public boolean book(int start, int end) {
        int count = 0;
        boolean flag = false;
        if (map.size() == 0) {
            map.put(start, end);
            flag = true;
        } else {
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                count++;
                if (count != map.size()) {
                    // check for conflicts in the map, if there is none then the loop continues
                    // otherwise breaks
                    if ((start < e.getKey() && end <= e.getKey()) || start >= e.getValue())
                        continue;
                    else
                        break;
                } else { // checking if last element doesn't break the conflict then put into the map
                    if ((start < e.getKey() && end <= e.getKey()) || start >= e.getValue()) {
                        map.put(start, end);
                        flag = true;
                    }
                }
            }
        }

        return flag;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
// @lc code=end
