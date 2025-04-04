public class TestSingleton_without_thread {
    public static void main(String[]args){
        for(int i=0;i<10;i++){
            Thread thread = new Thread(()->{
                Singleton_without_thread singletonWithOutThreadSafe = Singleton_without_thread.getInstance();
                System.out.println("Instance hash: " + singletonWithOutThreadSafe.hashCode());
            });
            thread.start();
        }
    }
}
