
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class test {

    @Test
    public void twoSum(){
        int target = 9;
        int nums[] = {2,7,11,15};
        int twoSum ;
        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                twoSum = nums[i] + nums[j];
                if (twoSum == target) {
                    System.out.println("[" + i +","+ j +"]");
                    return;

                }
            }
        }
    }

    @Test
    public void twoSum2(){
        int target = 9;
        int nums[] = {2,7,11,15};
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                int num[] = {hashtable.get(target - nums[i]), i};

            }
            hashtable.put(nums[i], i);

        }
    }


}
