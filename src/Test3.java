import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        List<String> animal = new ArrayList<>();

        animal.add("Fox");
        animal.add(("Hedgehog"));
        animal.add(("Dog"));
        animal.add("Kat");

        System.out.println(animal);
        System.out.println(animal.get(1));

        Collections.sort(animal);
        System.out.println(animal);
        System.out.println(animal.get(1));





    }


}
