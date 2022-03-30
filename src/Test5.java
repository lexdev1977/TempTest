import java.util.*;

public class Test5 {
    public static void main(String[] args) {

//        Map<Integer, String> mapInt = new HashMap<>();
//        mapInt.putAll(10,"ddd",12, "sd");


        List<Integer> listI = new ArrayList<>();
        Collections.addAll(listI, 11,12,13,13,11,13,15);

        System.out.println(listI);

        Collections.replaceAll(listI, 11, 22);

        System.out.println(listI);

        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 11, 2, 23, 5, 15, 4, 2, 4);

        Collections.sort(list);  // 2, 2, 4, 4, 5, 11, 15, 23

        int index = Collections.binarySearch(list, 5);    // 4
        System.out.println(index);

        int index2 = Collections.binarySearch(list, 15);  // 6
        System.out.println(index2);
        System.out.println(list.get(0));








    }
}
