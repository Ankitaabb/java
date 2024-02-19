
class sms implements Runnable{
    public void run(){
        for(int i=0; i<=15;i++){
            System.out.println("sms......" +i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
}
class mail implements Runnable{
    public void run(){
        for(int i=0; i<=10;i++){
            System.out.println("mail......" +i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
        }
    }
}
public class sandm {
    public static void main(String[] args) {

        sms obj = new sms();
        Thread t1 = new Thread(obj);

        mail obj2 = new mail();
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }    
}
