abstract class shape {
    abstract void draw();
}

class rectangle extends shape {
    void draw() {
        System.out.println("circle done");
    }
}

class ab_ex3 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.draw();
        // Circle c = new Circle();
        // c.draw();
    }
}
