import java.util.HashMap;
import java.util.Map;

public class twoSum {
    /*
    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
你可以按任意顺序返回答案。

示例 1：
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
示例 2：
输入：nums = [3,2,4], target = 6
输出：[1,2]
示例 3：
输入：nums = [3,3], target = 6
输出：[0,1]
     */
    public void twoSum() {
        int target = 9;
        int nums[] = {2,7,11,15};
        int twoSum ;
        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                twoSum = nums[i] + nums[j];
                if (twoSum == target) {
                    System.out.println("[" + i +","+ j +"]");
                    break;
                }
            }
        }
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }


}
