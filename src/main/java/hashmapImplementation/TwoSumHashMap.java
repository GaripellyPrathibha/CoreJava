package hashmapImplementation;

import java.util.HashMap;

public class TwoSumHashMap {
    public static int[] findIndices(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (numMap.containsKey(j)) {
                return new int[]{numMap.get(j), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

}
