package main;

import java.time.LocalDate;

public class GenderCheck implements PersonSelect {


    @Override
    public Person.Sex genderCheck(Person p) {
        return p.getGender();
    }

    public boolean eighteenOlder(Person p){
        return (LocalDate.now().getYear()-p.getBirthday().getYear())>=18 && (p.getGender()==Person.Sex.MALE);
    }
}