import java.util.ArrayList;

/**
 *
 */

public class IAmStupid {

    public static void main(String[] args) {
        ArrayList < Integer > a = new ArrayList < Integer >();
        ArrayList b = a;
        a.add(4);
        b.add(5);
        a.add(5);
        b.add(7);
        System.out.println(b.get(0));


    }

}
