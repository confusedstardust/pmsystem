public class Singleton {

    private Singleton(){}
    private static volatile Singleton instance;
    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null)
                return instance=new Singleton();
            }
        }
        return instance;
    }
    private  static class creatInstance{
        private static final Singleton SINGLETON=new Singleton();
    }

}