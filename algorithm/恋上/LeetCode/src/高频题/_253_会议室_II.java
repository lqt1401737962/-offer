package 高频题;

import sun.security.provider.MD2;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/meeting-rooms-ii/
 * @author Qitong!!
 * @Date 2020/6/22
 */
public class _253_会议室_II {

    //利用 优先级队列!
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null ||intervals.length == 0) return 0;

        Arrays.sort(intervals,(m1, m2)-> m1[0]- m2[0]);
        PriorityQueue<Integer> res = new PriorityQueue<>();
        res.add(intervals[0][1]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < res.peek()){
                res.add(intervals[i][1]);
            }else{
                res.poll();
                res.add(intervals[i][1]);
            }
        }
        return  res.size();
    }


    //利用两个数组模拟!
    public int minMeetingRooms1(int[ ][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        // 存放所有会议的开始时间
        int[] begins = new int[intervals.length];
        // 存放所有会议的结束时间
        int[] ends = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            begins[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        // 排序
        Arrays.sort(begins);
        Arrays.sort(ends);

        int room = 0, endIdx = 0;
        for (int begin : begins) {
            if (begin >= ends[endIdx]) { // 能重复利用会议室
                endIdx++;
            } else { // 需要新开一个会议室
                room++;
            }
        }

        return room;
    }
}
