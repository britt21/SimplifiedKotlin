import java.util.Random;

public class RandomValue {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random integer
        int randomNumber = random.nextInt(999999999);

        System.out.println("Random number: " + randomNumber);
    }
}

