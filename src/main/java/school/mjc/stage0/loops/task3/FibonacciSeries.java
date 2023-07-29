package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0;
        int b = 1;
        int next;
        if (lastFibonacci == 1) {
            System.out.println(a);
        } else if (lastFibonacci >= 2) {
            System.out.println(a);
            System.out.println(b);
        }
        for (int i = 2; i < lastFibonacci; i++) {
            next = a + b;
            System.out.println(next);
            a = b;
            b = next;
        }
    }

}
