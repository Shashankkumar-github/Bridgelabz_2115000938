import java.util.*;

public class ZeroSumSubarrays {
    public static void findSubarrays(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
			if(sum == 0 || map.containsKey(sum)){
                System.out.println("Subarray Found with Zero sum from index " + (map.getOrDefault(sum, -1) + 1) + " to " + i);
            }
            if(!map.containsKey(key)){
				map.put(sum, i);
			}

        }
    }

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int length = scn.nextInt();
	int arr[] = new int[length];
	for(int i=0;i<length;i++){
		arr[i] = scn.nextInt();
	}
        findSubarrays(arr);
    }
}
