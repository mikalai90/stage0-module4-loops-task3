package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public static void printDigitsSum(int t){
        int counterDigits = 0;
        int sum = 0;
        int temp = t;
        while(t != 0) {
            counterDigits++;
            t /= 10;
        }
        t = temp;
        for (int i = 0; i <= counterDigits; i++) {

            sum = sum + (t % 10);
            t /= 10;
        }
        System.out.println(Math.abs(sum));

    }

}
