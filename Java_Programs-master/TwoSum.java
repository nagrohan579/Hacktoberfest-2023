import java.util.Arrays;
import java.util.HashMap;

public class E1_TwoSum {
    public static void main(String[] args) {
        Solution1 ob = new Solution1();
        int nums[] = {3,3};
        int target = 6;

        int res[] = ob.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
    
}

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int res[] = new int[2];

        for(int i=0; i<nums.length; i++)
        {
            if(m.containsKey(target - nums[i]))
            {
                res[0] = m.get(target - nums[i]);
                res[1] = i;
                break;
            }
            else
                m.put(nums[i], i);
        }

        return res;
    }
}
