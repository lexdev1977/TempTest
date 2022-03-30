import java.lang.reflect.Array;
import java.util.*;

public class Test4 {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person(11, "Kat"));
        people.add(new Person(10, "Alex"));
        people.add(new Person(9, "Igor"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() - o2.getId();

//                if (o1.getId() >o2.getId()){
//                    return 1;
//                } else if (o1.getId()<o2.getId()){
//                    return -1;
//                } else return 0;
            }


        });

        people.get(0).printPerson();
        people.get(1).printPerson();
        people.get(2).printPerson();

        int i =0;
        for (Person pep: people){
            people.get(i++).printPerson();
            System.out.println(pep);

        }





    }



    static class Person{
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void printPerson() {
            System.out.println(id + " : " + name);
        }


    }



}
