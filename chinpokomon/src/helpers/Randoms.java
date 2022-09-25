package helpers;

import java.util.List;
import java.util.Random;

public class Randoms {

    public static boolean isValidPercentageValue(double percentage) {
        return percentage > 1 || percentage < 0;
    }

    public static void validatePercentageOrFail(double percentage) throws RuntimeException {
        if (Randoms.isValidPercentageValue(percentage)) {
            throw new RuntimeException("percentage value must be between 0 and 1 inclusive.");
        }
    }
    public static int randomBetween(int min, int max) {
        Random ran = new Random();
        return ran.nextInt(max-min+1) + min;
    }

    public static <T> T anyFrom(List<T> elements) {
        int random = Randoms.randomBetween(0, elements.size()-1);
        return elements.get(random);
    }

    public static boolean satisfiesWithPercentage(double percentage) {
        Randoms.validatePercentageOrFail(percentage);
        Random ran = new Random();
        return percentage > ran.nextDouble();
    }
}
