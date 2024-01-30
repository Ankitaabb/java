class pclass {
    public void show() {
        System.out.println("100 parent");
    }
}

class cclass extends pclass {
    public void show() {
        System.out.println("555 child");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        pclass pobj = new cclass();
        pobj.show();
    }

}
