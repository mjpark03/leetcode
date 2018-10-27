/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if (intervals.length == 0) return 0;
        
        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) { return i1.start - i2.start; }
        });
        
        PriorityQueue<Interval> q = new PriorityQueue<>(intervals.length, new Comparator<Interval>() {
           public int compare(Interval i1, Interval i2) { return i1.end - i2.end; } 
        });
        
        q.offer(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            Interval interval = q.poll();
            if (intervals[i].start >= interval.end) {
                interval.end = intervals[i].end;
            } else {
                q.offer(intervals[i]);
            }
            
            q.offer(interval);
        }
        
        return q.size();
    }
}
