package md.dimatanasciuc.exceptionsservicetask;

public class ExceptionMicroservice {
    public static void main(String[] args) {
        String controlVariable = null;
    //    System.out.println("The String lenght it is = " + TextManager.getTheTextLenght(controlVariable));
        System.out.println("The String lenght it is = " + TextManager.getTheTextLenghtWithTryAndCatch(controlVariable));
        System.out.println("The String lenght it i = " + TextManager.getTheTextLenghtWithIf(controlVariable));
        System.out.println(ArithmeticOperationService.divideWithoutExceptionHandLing(0,3));
        System.out.println(ArithmeticOperationService.divideWithErrorExceptionHandLing(0,0));
        System.out.println("Mai departe");
    }
}
