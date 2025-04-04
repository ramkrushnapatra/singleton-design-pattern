


public class Singleton_without_thread {
    private static  Singleton_without_thread instance;

    private Singleton_without_thread(){
        System.out.println("instance created by thread"+ Thread.currentThread().getName());
    }

    public static Singleton_without_thread getInstance(){
        if(instance == null){
            instance= new Singleton_without_thread();
        }
        return instance;
    }
}
