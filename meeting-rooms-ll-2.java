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
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        int rooms = 0;
        
        int index = 0;
        for (Interval interval: intervals) {
            starts[index] = interval.start;
            ends[index++] = interval.end;
        }
        
        Arrays.sort(starts);
        Arrays.sort(ends);
        
        int endIndex = 0;
        for (int i = 0; i < index; i++) {
            if (starts[i] >= ends[endIndex]) {
                endIndex++;
            } else {
                rooms++;
            }
        }
        
        return rooms;
    }
}
