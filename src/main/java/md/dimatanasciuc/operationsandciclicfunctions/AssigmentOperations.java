package md.dimatanasciuc.operationsandciclicfunctions;

public class AssigmentOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a = a + 1;
        System.out.println(a);

        b = b % a;
        // b %= a;
        System.out.println(b);

        a %= b;
        // a = a % b; a = 11 % 4;
        System.out.println(a);
        a += 4;

        // calculate the sum of the numbers till xl
        int x = 150;
        int sum = 0;
        for (int i = 0; i <= x; i++){
          //  sum = sum + i;
            sum += i;
        }
        System.out.println(sum);

        double c = 45;
        double d = 5;

        d /= c;
        double result = d / c;
        System.out.println(result);


    }
}
