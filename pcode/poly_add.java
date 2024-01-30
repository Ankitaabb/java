public class poly_add {
    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        poly_add obj = new poly_add();
        System.out.println(obj.add(13, 56));
        System.out.println(obj.add(3.4f, 5.9f));

    }
}
