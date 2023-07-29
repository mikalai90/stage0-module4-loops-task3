package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int number = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            number += 9 * Math.pow(10, i);
            sum += number;
        }
        System.out.println(sum);

    }

}
