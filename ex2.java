interface agenda1 {
    void task1();
}

interface lastagendga extends agenda1 {
    void task2();
}

class a implements lastagendga {
    public void task1() {
        System.out.println("hello task 1");

    }

    public void task2() {
        System.out.println("hello task 2");

    }

    public static void main(String[] args) {
        a obj = new a();
        obj.task1();
        obj.task2();
    }
}