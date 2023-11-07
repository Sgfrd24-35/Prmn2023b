package lecture02;

import java.util.Objects;
import java.util.Scanner;

public class Gakuseki {
    String gakuseki;
    Scanner input = new Scanner(System.in);
    void checkGakuseki(String g) {
        System.out.println("学籍番号を入力してください");
        String gakuseki = input.next();
        if (Objects.equals(gakuseki, g)){
            System.out.println("complete!!");
        }else{
            System.out.println("error!!");
        }
        return;
    }

}
