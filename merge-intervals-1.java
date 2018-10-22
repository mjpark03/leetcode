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
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> results = new ArrayList<>();
        if (intervals.size() == 0) return results;
            
        intervals.sort((interval1, interval2) -> { 
            if (interval1.start == interval2.start)
                return 0;
            
            return interval1.start < interval2.start ? -1 : 1; 
        });
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        
        for (Interval interval: intervals) {
            if (interval.start <= end) {
                end = Math.max(end, interval.end);
            } else {
                results.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        
        results.add(new Interval(start, end));
        return results;
    }
}
