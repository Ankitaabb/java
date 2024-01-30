class pclass {
    public int i = 100;
}

class Cclass extends pclass {
    public int i = 555;
}

class pm_overriding {
    public static void main(String[] args) {
        pclass obj = new Cclass();
        System.out.println(obj.i);
    }
}