class Demo extends Thread{
    public void run(){
    System.out.println("thread.....");
}
}

public class thread {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.start(); 
    }
}
