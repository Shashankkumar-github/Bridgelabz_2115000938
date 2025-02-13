import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


class SlidingWindowMax {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0; i < nums.length; i++) {
            if(!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if(i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
		int length = scn.nextInt();	
		int nums[] = new int[length];
		for(int i=0;i<length;i++){
		nums[i] = scn.nextInt();
		}
		int k =scn.nextInt();
        int[] result = maxSlidingWindow(nums, k);
        for (int num : result) {
            System.out.print(num + " "); 
        }
    }
}
