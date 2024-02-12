class Employee {
    int id;

    Employee(int i) {
        id = i;
    }

    Employee() {
    }
}

public class copyWOcon {
    public static void main(String[] args) {
        Employee e1 = new Employee(100);
        Employee e2 = new Employee();
        e2.id = e1.id;
        System.out.println(e2.id);
    }
}
