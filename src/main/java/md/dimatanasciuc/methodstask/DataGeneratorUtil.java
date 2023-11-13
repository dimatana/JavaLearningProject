package md.dimatanasciuc.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    private static Random objectOfRandomClass = new Random();

    public static int getRandomInt(int min, int max) {

        int delta = max - min;
        if (delta<=0){
            System.out.println("The delta has to be positive");
            return 0;
        }
        int randomIntForThisDelta = objectOfRandomClass.nextInt(delta);
        return randomIntForThisDelta + min;

    }

    public static int getRandomInt(int limit){
        return objectOfRandomClass.nextInt(limit);
    }

    static String getRandomEmail(String domainName){
        String uniqueUUID = UUID.randomUUID().toString();
        return uniqueUUID + "@" + domainName;
    }

    static String getRandomEmail(int maxLenght, String domainName) {
        String acceptedChars = "ABCDfdsg4325";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < maxLenght; i++) {
            int randomIndex = DataGeneratorUtil.getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("As part of iteration [" + i +"] the letter [" + acceptedChars.charAt(randomIndex) + "] was added");

        }
          return stringBuilder.toString() + "@" + domainName;
    }
}
