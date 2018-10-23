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
        intervals.add(newInterval);
        
        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        
        List<Interval> results = new ArrayList<>();
        int start = intervals.get(0).start, end = intervals.get(0).end;
        for (Interval interval: intervals) {
            if (interval.start > end) {
                results.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            } else {
                end = Math.max(end, interval.end);
            }
        }
        
        results.add(new Interval(start, end));
        return results;
    }
}
