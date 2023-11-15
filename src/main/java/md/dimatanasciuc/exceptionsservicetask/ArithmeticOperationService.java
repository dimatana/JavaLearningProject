package md.dimatanasciuc.exceptionsservicetask;

public class ArithmeticOperationService {
    public static int divideWithoutExceptionHandLing(int a, int b){
        return a/b;
    }

    public static double divideWithErrorExceptionHandLing(int a, int b){
        try {
            return a/b;
        } catch (ArithmeticException capturedException){
            System.out.println(capturedException.getMessage());
            System.out.println("This code block is executed only if there is an exceptions in the try section");
            return 0.0;
        } finally {
            System.out.println("This block is executed all the times");
        }
    }
}
