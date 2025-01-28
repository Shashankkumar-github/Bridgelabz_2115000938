import java.util.Random;

public class level3_1 {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; 
        }

        int sum = calculateSum(heights);
        double mean = calculateMean(heights, sum);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\nSum of Heights: " + sum);
        System.out.println("Mean Height: " + mean);
        System.out.println("Shortest Player: " + shortest);
        System.out.println("Tallest Player: " + tallest);
    }

    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double calculateMean(int[] heights, int sum) {
        return sum/(double) heights.length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}
