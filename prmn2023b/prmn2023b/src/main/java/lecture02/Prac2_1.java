package lecture02;

import java.util.Scanner;

public class Prac2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("学籍番号：");
        String gnum = input.next();
        System.out.print("氏名：");
        String name = input.next();

        System.out.println("学籍番号："+gnum);
        System.out.println("氏名："+name);
    }
}
