// class employee {
//     int id;
//     String name;

//     employee(int i, String n) {
//         System.out.println(this.id);
//         id = i;
//         name = n;
//     }
// }

// public class constructor {
//     public static void main(String[] args) {
//         employee e1 = new employee(100, "raja");
//         System.out.println(e1.id);
//         employee e2 = new employee(111, "aja");
//     }
// }
class employee {
    int id;

    employee(int id) {
        this.id = id;
    }
}

public class constructor {
    public static void main(String[] args) {
        employee e1 = new employee(100);
        System.out.println(e1.id);
    }
}
