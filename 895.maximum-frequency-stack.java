/*
 * @lc app=leetcode id=895 lang=java
 *
 * [895] Maximum Frequency Stack
 */

// @lc code=start
class FreqStack {

    Map<Integer, Integer> map;
    PriorityQueue<priorityQueue> heap;
    int order;

    public FreqStack() {
        this.map = new HashMap<>();
        this.heap = new PriorityQueue<>();
        this.order = 0;
    }

    public void push(int val) {
        map.put(val, map.getOrDefault(val, 0) + 1);
        heap.add(new priorityQueue(val, map.get(val), ++order));
    }

    public int pop() {
        priorityQueue pQ = heap.poll();
        int val = pQ.val;
        map.put(val, map.get(val) - 1);
        return val;
    }
}

class priorityQueue implements Comparable<priorityQueue> {

    Integer val;
    Integer freq;
    Integer order;

    priorityQueue(Integer val, Integer freq, Integer order) {
        this.val = val;
        this.freq = freq;
        this.order = order;
    }

    public int compareTo(priorityQueue other) {
        int freqCompare = other.freq.compareTo(this.freq);
        return freqCompare != 0 ? freqCompare : other.order.compareTo(this.order);
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
// @lc code=end
