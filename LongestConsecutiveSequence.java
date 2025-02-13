import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for(int num : nums) map.put(num, true);
        int longest = 0;

        for(int num : nums){
            if(!map.containsKey(num - 1)){
                int curr = num;
                int count = 1;
                while(map.containsKey(curr + 1)){
                    curr++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner?(System.in);
		int length = scn.nextInt();
		int nums[] = new int[length];
		System.out.println("enter the element :");
		for(int i=0;i<length;i++){
			nums[i] =scn.nextInt();
		}
        System.out.println(longestConsecutive(nums));
    }
}
