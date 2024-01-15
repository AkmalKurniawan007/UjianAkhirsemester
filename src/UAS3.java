import java.util.ArrayList;
import java.util.Random;

public class UAS3 {
    public static void main(String[] args) {
        ArrayList<Integer> speeds = Kendaraanrandom(200);
        ArrayList<Integer> aboveThreshold = sortir(speeds, 80, 100);
        ArrayList<Integer> belowThreshold = sortir(speeds, 80);

        System.out.println("Kendaraan kecepatan 80 km/h sampai 100 km/h:");
        tampilankecepatan(aboveThreshold);
        System.out.println("Kendaraan Di bawah  80 km/h:");
        tampilankecepatan(belowThreshold);
    }

    public static ArrayList<Integer> Kendaraanrandom(int count) {
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

    public static ArrayList<Integer> sortir(ArrayList<Integer> speeds, int min, int max) {
        ArrayList<Integer> filteredSpeeds = new ArrayList<>();
        for (int speed : speeds) {
            if (speed >= min && speed <= max) {
                filteredSpeeds.add(speed);
            }
        }
        return filteredSpeeds;
    }

    public static ArrayList<Integer> sortir(ArrayList<Integer> speeds, int max) {
        ArrayList<Integer> filteredSpeeds = new ArrayList<>();
        for (int speed : speeds) {
            if (speed < max) {
                filteredSpeeds.add(speed);
            }
        }
        return filteredSpeeds;
    }

    public static void tampilankecepatan(ArrayList<Integer> speeds) {
        for (int speed : speeds) {
            System.out.println(speed + " km/h");
        }
    }
}