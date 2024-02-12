abstract class ab {
    abstract void task1();
}

class test extends ab {
    void task1() {
        System.out.println("hello task1 done");
    }

    public static void main(String[] args) {
        test1 t = new test1();
        t.task1();
    }
}
