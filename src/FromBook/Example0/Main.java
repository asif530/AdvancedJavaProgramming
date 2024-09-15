package FromBook.Example0;

import FromBook.Example0.FilterImpl;
import FromBook.Example0.Filterable;
import FromBook.Example0.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FilterImpl filter = new FilterImpl();


        List<Person> personList = new ArrayList<>();
        personList.add(new Person(32));
        personList.add(new Person(34));
        personList.add(new Person(35));
        personList.add(new Person(22));

        List<Person> personOlderThan30 = filter.filter(
                personList, new Filterable() {
                    @Override
                    public boolean apply(Person person) {
                        return person.getAge()>30;
                    }
                });

        personOlderThan30.forEach(x-> System.out.println(x.getAge()));
        System.out.println("===================================");

        Filterable filterable = new Filterable() {
            @Override
            public boolean apply(Person person) {
                return person.getAge()<30;
            }
        };

        List<Person> personYoungerThan30 = filter.filter(personList,filterable);
        personYoungerThan30.forEach(x-> System.out.println(x.getAge()));

    }
}
