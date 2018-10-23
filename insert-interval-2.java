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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> results = new ArrayList<>();
        int index = 0;
        
        while (index < intervals.size() && intervals.get(index).end < newInterval.start)
            results.add(intervals.get(index++));
        
        while (index < intervals.size() && intervals.get(index).start <= newInterval.end) {
            newInterval.start = Math.min(intervals.get(index).start, newInterval.start);
            newInterval.end = Math.max(intervals.get(index++).end, newInterval.end);
        }
        results.add(newInterval);
        
        while (index < intervals.size())
            results.add(intervals.get(index++));
        
        return results;
    }
}
