class Employee {
    int eid;
    String name;
    static String compname;
}

class test {
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.eid = 200;
        e1.name = "raja";
        e2.eid =300;
        Employee.compname = "delloite";
        System.out.println(Employee.compname);

    }
}
