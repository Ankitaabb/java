public class instance_intializer {
    {
        System.out.println("initiaizer block");
    }

    instance_intializer() {
        System.out.println("hello constructor");
    }

    public static void main(String[] args) {
        System.out.println("hello man");
        instance_intializer obj = new instance_intializer();

    }
}
