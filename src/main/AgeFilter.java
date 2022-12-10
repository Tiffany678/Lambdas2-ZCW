package main;

import java.time.LocalDate;

public class AgeFilter implements PersonSelect {

    @Override
    public Person.Sex genderCheck(Person p) {

        return p.getGender();
    }

    @Override
    public boolean eighteenOlder(Person p){
        return (LocalDate.now().getYear()-p.getBirthday().getYear())>=18;
    }
}