class dog {
    public void say() {
        System.out.println("mean..");
    }
}

class cat {
    public void say() {
        System.out.println("hua...");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        dog dobj = new dog();
        cat cobj = new cat();
        dobj.say();
        cobj.say();

    }
}
