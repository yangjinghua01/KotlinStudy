public class SIngleton {
    private static SIngleton instance;

    private SIngleton() {
    }
    public synchronized static SIngleton getInstance(){
        if (instance == null){
            instance = new SIngleton();
        }
        return instance;
    }
}
