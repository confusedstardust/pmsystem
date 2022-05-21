import java.util.Arrays;

public class match {
//    单例模式同步锁
    private static match instance;
    private match(){}
    public static synchronized match getInstance(){
        if(instance == null){
            instance = new match();
        }
        return instance;
    }
}