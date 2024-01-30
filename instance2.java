public class instance2 {
    {
        System.out.println("hello non static block");
    }
    {
        System.out.println("hello non static block2");
    }

    instance2() {
        System.out.println();
        System.out.println("constuctor..");
    }

    public static void main(String[] args) {
        {
            instance2 obj = new instance2();
        }
    }

}
