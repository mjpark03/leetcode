import java.util.*;

public class SingleNumber3 {

	public int[] singleNumber(int[] nums) {

		if (nums==null || nums.length==0)
			return new int;

		LinkedList<Integer> singleNumbers = new LinkedList<>();
		HashMap<Integer, Integer> numberMap = new HashMap<>(nums.length);

		for (int i=0; i<nums.length; i++) {
			int key = nums[i];

			if (numberMap.containsKey(key)) {
				int value = (int)numberMap.get(key);
				numberMap.put(key, value+1);
			} else {
				numberMap.put(key, 1);
			}
		}

		Set<Integer> keys = numberMap.keySet();
		for(Integer key : keys) {
			if (numberMap.get(key).intValue() == 1) {
				singleNumbers.add(key);
			}
		}

		Integer[] singleNumbersArr = singleNumbers.toArray(new Integer[singleNumbers.size()]);
		int[] result = convertPrimitivesInt(singleNumbersArr);

		return result;
	}

	public int[] convertPrimitivesInt(Integer[] arr) {

		int[] convertArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			convertArr[i] = arr[i].intValue();
		}

		return convertArr;
	}
}