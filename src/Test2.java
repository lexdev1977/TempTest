import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        list.add(1);
        set.add(1);

        System.out.println(list.get(0));

        System.out.println(list.size());
        System.out.println(set.size());




    }
}
