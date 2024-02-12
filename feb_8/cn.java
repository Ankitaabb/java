import java.io.Console;

public class cn {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("enter a uid");
        String uid = c.readLine();

        System.out.println("enter a password..");
        char[]pwd = c.readPassword();
        System.out.println(uid);
        for(char ch:pwd){
            System.out.println(ch);
        }
    }
    
}
