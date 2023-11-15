package md.dimatanasciuc.exceptionsservicetask;

public class TextManager {

    public static int getTheTextLenght(String inputString){
        return inputString.length();
    }
    public static int getTheTextLenghtWithTryAndCatch(String inputString){
        try {
            return inputString.length();
        } catch (NullPointerException exceptionFromTheTryBlock){
            exceptionFromTheTryBlock.printStackTrace();
            return 0;

        }
    }

    public static int getTheTextLenghtWithIf(String inputText){
        if (inputText == null){
            return 0;
        } else {
            return inputText.length();
        }
    }
}
