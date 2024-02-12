class destructor {
    public destructor() {
        System.out.println("hello con...");
    }

    protected void finalize() {
        System.out.println("object is destroyed by garbage collector");
    }

    public static void main(String args[]) {
        destructor obj = new destructor();
        obj.finalize();
    }
}
