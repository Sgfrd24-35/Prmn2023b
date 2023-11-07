package lecture02;

import java.util.Arrays;
import java.util.Scanner;

public class GakuPass {
    String[][] data;
    int m;
    int n;
    GakuPass(int x, int y) {
        this.m = x;
        this.n = y;
        data = new String[m][n];
    }
    Scanner input = new Scanner(System.in);

    void checkGakuPass(){
        System.out.print("学籍番号：");
        String gk = input.next();
        System.out.print("パスワード：");
        String pw = input.next();

        int jnum = 1;
        int jpass = 1;

        for (int i=0; i<n-1; i++){
            for (int j=0; j<m; j++) {
                if (data[j][i].equals(gk)){
                    jnum = 0;
                    if (data[j][i+1].equals(pw)){
                        jpass = 0;
                    }
                }
            }
        }

        //test
        String[][] ndata = new String[n][m];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++) {
                ndata[j][i] = data[i][j];
            }
        }
        for (int i=0; i<n-1; i++){
            if (Arrays.binarySearch(ndata[i], gk)>=0) {
                if (Arrays.binarySearch(ndata[i], gk)>=0) {
                    System.out.println("ログイン成功");
                } else {
                    System.out.println("不正なアクセスです");
                    System.exit(0);
                }
            } else {
                System.out.println("error");
                System.exit(0);
            }
        }
        //test

        if (jnum == 0) {
            if (jpass == 0) {
                System.out.println("ログイン成功");
            } else {
                System.out.println("不正なアクセスです");
                System.exit(0);
            }
        } else {
            System.out.println("error");
            System.exit(0);
        }
    }
}
