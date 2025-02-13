import java.util.*;

public class GivenSum {
    public static boolean hasPair(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(target-num)) return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	    int length =scn.nextInt();
	    int arr[] = new int[length];
		System.out.println("enter the elements of array");
		for(int i=0;i<length;i++){
		arr[i] = scn.nextInt();
		}
		System.out.println("enter the target sum");
        int target = scn.nextInt();
        System.out.println(hasPair(arr, target));
    }
}
