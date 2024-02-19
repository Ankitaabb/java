
class a extends Thread{
    public void run(){
        for(int i=0; i<=15;i++){
            System.out.println("a......" +i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
}
class b extends Thread{
    public void run(){
        for(int i=0; i<=10;i++){
            System.out.println("b......" +i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
}
class c extends Thread{
    public void run(){
        for(int i=0; i<=10;i++){
            System.out.println("c......" +i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
}
public class task3 {
    public static void main(String[] args) {
        a t1 = new a();
        b t2 = new b();
        c t3 = new c();

        t1.start();
        t2.start();
        t3.start();
    }    
}
