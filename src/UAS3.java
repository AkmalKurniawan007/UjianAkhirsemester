import java.util.ArrayList;
import java.util.Random;

public class UAS3 {
    public static void main(String[] args) {
        ArrayList<Integer> speeds = captureSpeeds(200);
        ArrayList<Integer> aboveThreshold = filterAboveThreshold(speeds, 80, 100);
        ArrayList<Integer> belowThreshold = filterBelowThreshold(speeds, 80);

        System.out.println("Speeds above 80 km/h and below 100 km/h:");
        displaySpeeds(aboveThreshold);
        System.out.println("\nSpeeds below 80 km/h:");
        displaySpeeds(belowThreshold);
    }

    public static ArrayList<Integer> captureSpeeds(int count) {
        ArrayList<Integer> speeds = new ArrayList<>();
        Random random = new Random();

        int i = 0;
        while (i < count) {
            int speed = random.nextInt(200); // Random speed between 0 and 199 km/h
            speeds.add(speed);
            i++;
        }

        return speeds;
    }

    public static ArrayList<Integer> filterAboveThreshold(ArrayList<Integer> speeds, int min, int max) {
        ArrayList<Integer> filteredSpeeds = new ArrayList<>();
        for (int speed : speeds) {
            if (speed >= min && speed <= max) {
                filteredSpeeds.add(speed);
            }
        }
        return filteredSpeeds;
    }

    public static ArrayList<Integer> filterBelowThreshold(ArrayList<Integer> speeds, int max) {
        ArrayList<Integer> filteredSpeeds = new ArrayList<>();
        for (int speed : speeds) {
            if (speed < max) {
                filteredSpeeds.add(speed);
            }
        }
        return filteredSpeeds;
    }

    public static void displaySpeeds(ArrayList<Integer> speeds) {
        for (int speed : speeds) {
            System.out.println(speed + " km/h");
        }
    }
}