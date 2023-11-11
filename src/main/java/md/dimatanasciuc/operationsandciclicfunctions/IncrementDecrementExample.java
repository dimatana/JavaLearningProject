package md.dimatanasciuc.operationsandciclicfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {
        int a = 42;
        int b = 20;

        System.out.println(a++);
        System.out.println(++a);

        System.out.println(++a);

        a = a + 1;
        System.out.println(a);
        System.out.println(a--);

        System.out.println(a);

        System.out.println(b);
        System.out.println(--b);
        b = --a;
        System.out.println(b);
        System.out.println(a);

    }
}
