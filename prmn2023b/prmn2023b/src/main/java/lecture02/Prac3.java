package lecture02;

public class Prac3 {
    public static void main(String[] args) {
        GakuPass gp = new GakuPass(10, 2);
        String[][] test = {{"b2222200", "12"},
                            {"b2222210", "34"},
                            {"b2222220", "56"},
                            {"b2222230", "78"},
                            {"b2222240", "90"},
                            {"b2222250", "21"},
                            {"b2222260", "43"},
                            {"b2222270", "65"},
                            {"b2222280", "87"},
                            {"b2222290", "09"}};
        gp.data = test;
        gp.checkGakuPass();
    }
}
