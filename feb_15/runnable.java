class sms implements Runnable {

    public void run() {
        System.out.println("hello thread using runnable");
    }

    public static void main(String[] args) {
        sms obj = new sms();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
