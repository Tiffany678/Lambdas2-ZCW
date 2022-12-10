package test;

import main.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestSocialNetwork {
    @Test
    public void testSocialNetwork() {
        SocialNetwork sn = new SocialNetwork();
        Person p = new Person("John", LocalDate.of(1991, 01, 01), Person.Sex.MALE, "John@email.com");
        List<Person> lp = new ArrayList<>();
        lp.add(p);

        PersonSelect cp = new AgeFilter();
        Assert.assertEquals("John", p.getName());
        Assert.assertEquals(LocalDate.of(1991, 01, 01), p.getBirthday());
        Assert.assertEquals(Person.Sex.MALE, p.getGender());
        Assert.assertEquals("John@email.com", p.getEmailAddress());

        GenderCheck gc = new GenderCheck();
        Assert.assertEquals(Person.Sex.MALE, gc.genderCheck(p));
        Assert.assertEquals(true, gc.eighteenOlder(p));

        AgeFilter af = new AgeFilter();
        Assert.assertEquals(Person.Sex.MALE, af.genderCheck(p));
        Assert.assertEquals(true, af.eighteenOlder(p));

    }
}
