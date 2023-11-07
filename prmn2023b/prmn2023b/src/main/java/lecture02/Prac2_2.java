package lecture02;

import java.util.Scanner;

public class Prac2_2 {
    public static void main(String[] args) {
        String name_1 = "千歳花子";
        int num_1 = 2110000;
        Scanner input = new Scanner(System.in);

        Login log = new Login(name_1, num_1);

        System.out.println("名前を入力してください");
        String name_2 = input.next();
        System.out.println("学籍番号を入力してください");
        int num_2 = input.nextInt();
        log.meessage(name_2, num_2);
    }
}
