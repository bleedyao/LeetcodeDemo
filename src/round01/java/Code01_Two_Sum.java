package round01.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Code01_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int findNum = target - nums[i];
            if (map.containsKey(findNum)) {
                return new int[]{map.get(findNum), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] caseArr = {2, 7, 9, 11, 15};
        int[] result = new Code01_Two_Sum().twoSum(caseArr, 26);
        System.out.println(Arrays.toString(result));
    }
}
