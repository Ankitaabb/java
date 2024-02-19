import java.util.*;
public class linklist {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add(70);
        li.addFirst(10);
        li.addLast(30);

        Iterator i = li.iterator();
        while(i.hasNext()){
           System.out.println(i.next());
        }

    }
}
