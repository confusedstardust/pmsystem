import java.util.ArrayList;
import java.util.Scanner;

public class Singleton2 {
//    双重检查锁定
    private static Singleton2 instance; // 定义一个静态的对象
    private static ArrayList<String> list = new ArrayList<String>();
    private Singleton2() {
    }
    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            list.add(str);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}