import java.util.*;

public class TwoSum{
    public static int[] find(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
		int length = scn.nextInt();
		int nums[] = new int[length];
		System.out.println("enter the element");
		for(int i=0;i<length;i++){
			nums[i] = scn.nextInt();
		}
		System.out.println("enter the target: ");
		int target = scn.nextInt();
        System.out.println(Arrays.toString(find(nums, target)));
    }
}
