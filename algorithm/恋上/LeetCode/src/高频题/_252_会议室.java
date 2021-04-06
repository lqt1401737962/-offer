package 高频题;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/meeting-rooms/
 * @author Qitong!!
 * @Date 2020/6/22
 */
public class _252_会议室 {
    public boolean canAttendMeetings(int[][] intervals) {
        if (intervals == null || intervals.length < 2) return true;

        Arrays.sort(intervals,(m1,m2)-> m1[0] - m2[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i-1][1]>intervals[i][0]){
                return false;
            }
        }
        return true;
    }
}
