import java.util.HashSet;
import java.util.Random;

public class level3_7 {

    public static void main(String[] args) {
        HashSet<Integer> otpSet = new HashSet<>();
        Random random = new Random();

        while (otpSet.size() < 10) {
            otpSet.add(generateOTP(random));
        }

        System.out.println("Generated Unique OTPs: " + otpSet);
    }

    public static int generateOTP(Random random) {
        return 100000 + random.nextInt(900000); 
    }
}
