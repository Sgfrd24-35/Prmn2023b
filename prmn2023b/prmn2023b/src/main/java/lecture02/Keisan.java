package lecture02;

import java.util.Scanner;

public class Keisan {
    float[] fnum;
    float sum;
    Scanner input = new Scanner(System.in);

    Keisan(int n) {
        fnum = new float[n];
    }

    float insumNum() {
        sum = 0;
        for (float i:fnum) {
            System.out.print(i+"つ目：");
            i = input.nextFloat();
            sum = sum + i;
        }
        System.out.println("合計値："+sum);
        return sum;
    }

    void judgeSize() {
        if (sum < 50) {
            System.out.println("small");
        } else if (sum < 100) {
            System.out.println("big");
        } else {
            System.out.println("great");
        }
        return;
    }
}
