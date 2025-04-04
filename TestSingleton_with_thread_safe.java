public class TestSingleton_with_thread_safe {
    public static void main(String[]args){
        for(int i=0;i<10;i++){
            Thread thread = new Thread(()->{
                Singleton_with_thread_safe singletonWithThreadSafe = Singleton_with_thread_safe.getInstance();
                System.out.println("Instance hash: " + singletonWithThreadSafe.hashCode());
            });
            thread.start();
        }
    }
}
