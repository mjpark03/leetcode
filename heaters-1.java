
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {

        int max = -1;
        Arrays.sort(heaters);

        for(int house: houses) {
            max = Math.max(max, getRadius(house, heaters));
        }

        return max;
    }

    private int getRadius(int house, int[] heaters) {

        int heatersLength = heaters.length;
        int left = 0;
        int right = heaters.length;
        int minDistance = Integer.MAX_VALUE;

        while(left < right) {
            int mid = left + (right - left) / 2;
            if (heaters[mid] < house) left = mid + 1;
            else right = mid;
        }

        int distance1 = (right == heatersLength) ? Integer.MAX_VALUE : heaters[right] - house;
        int distance2 = (right == 0) ? Integer.MAX_VALUE : house - heaters[right - 1]; 
        minDistance = Math.min(distance1, distance2);

        return minDistance;
    }
}
