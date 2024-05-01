package md.tekwillacademy.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    private static Random random = new Random();

    public static int generateRandomInt(int limit) {

        return random.nextInt(limit);
    }

    public static int generateRandomInt(int min, int max) {

        if (max > min) {
            return random.nextInt(min, max);
        } else {
            return 0;
        }

    }

    public static String returnRandomString(String domain) {
        String uuid = UUID.randomUUID().toString();
        return uuid + "@" + domain;

    }

    public static String returnRandomString() {
        String uuid = UUID.randomUUID().toString();
        return uuid + "@gmail.com";

    }

}

