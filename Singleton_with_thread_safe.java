

public class Singleton_with_thread_safe {
    private static  Singleton_with_thread_safe instance;

    private Singleton_with_thread_safe() {
        System.out.println("Singleton instance created by: " + Thread.currentThread().getName());
    }
    public static synchronized Singleton_with_thread_safe getInstance(){
        if(instance==null){
            instance=new Singleton_with_thread_safe();
        }
        return instance;
    }
}
