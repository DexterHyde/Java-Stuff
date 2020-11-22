package CodingChallenges;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        int[] numbers = new int[] {2, 3, 7, 4, 8};
        int target = 6;
        int [] win= getTwoNumbers(numbers, target);
        System.out.println(win[0] + " " + win[1]);
    }

    public static int[] getTwoNumbers (int[] nums,int target){
        Map <Integer, Integer> numberDB = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(numberDB.containsKey(target - nums[i])){
                return new int[] {numberDB.get(target - nums[i]), i};
            }

            numberDB.put(nums[i], i);
        }

        return new int[] {-1 , -1};
    }
}
