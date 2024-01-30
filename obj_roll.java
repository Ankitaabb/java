public class obj_roll {
    int roll = 5;

}

class test {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s2.roll = 25;
        System.out.println(s1.roll);
        System.out.println(s2.roll);
    }
}
