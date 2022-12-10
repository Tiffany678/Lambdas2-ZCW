package main;

import java.util.List;

public class SocialNetwork {
    public void printPeople(List<Person> people, PersonSelect tester) {
        for (Person p : people) {
            p.printPerson();
        }
    }
}